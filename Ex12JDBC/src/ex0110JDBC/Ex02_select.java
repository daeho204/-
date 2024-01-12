package ex0110JDBC;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_select {

	public static void main(String[] args) {
		
		//전역변수
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String name = null;
		//로그인 : id,pw를 입력받아서 DB의 회원정보와 일치하는지 확인
		//SQL문장 : select name from jdbc_member where id = ?(입력한id) and pw = ?(입력한pw);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=====로그인=====");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		try {
//			1. ojdbc.jar 외부 라이브러리 프로젝트에 import
//			2. OracleDriver클래스 찾기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			3. DB연결 (접속에 필요한 정보 정의)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String dbpw = "12345";
			
			conn = DriverManager.getConnection(url, user, dbpw);
			if(conn!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Connection Failed");
			}
//			4. SQL문장 작성
			String sql = "select name from jdbc_member where id = ? and pw = ?";
			
//			5. SQL문장 검사
			psmt = conn.prepareStatement(sql);
			
//			6. 바인드변수=? 에 값 채우기
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
//			7. SQL문장 실행
			rs = psmt.executeQuery();
			//executeQuery메소드가 Resultset으로 값을 반환함
			//ResultSet : select 의 결과를 저장하는 객체
			//Select문을 필요로 할때는 executeQuery()를 사용
			
			
			//처음 rs 객체는 포인터가 컬럼의 이름에 있음. 그렇기때문에 한줄 밑에서 부터 실행해야하는데
			//그러기위해 rs.next()를 사용한다
			//만약 다음에 가져올 값이 있다면(다음행이 존재한다면) true, 없다면 false를 반환한다
			
			if(rs.next()) {
				name = rs.getString(1); //getString은 int형과 String형이 있다
//				name = rs.getString("name");
			}
			
			
		} catch (Exception e) {
			
		}finally {
			//무조건 실행 : rs -> psmt -> conn 문을 연 역순으로 닫는다
			try {
				if(rs!=null) rs.close();
				if(psmt!=null) psmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if(name!=null) {
		System.out.println(name + "님 로그인 성공하셨습니다. 환영합니다!");
		}else {
			System.out.println("아이디 비밀번호를 다시 확인하세요.");
		}
	}

}
