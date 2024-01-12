package ex0110JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01_insert {
	// CRUD
	// Create Read Update Delete
	// Insert Select Update Delete
	public static void main(String[] args) {
		//전역변수 선언
		PreparedStatement psmt = null;
		Connection conn = null;
		
		// 회원가입: 사용자에게 (id,pw,name,birth)입력받아서 DB에 저장
		// insert into table () values ();
		// 필요한 데이터: 사용자가 입력한 id, pw, name, birth
		// DB에 저장은 JDBC API 사용

		// 1.사용자로부터 회원정보 입력
		// 입력받기 위한 class

		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원가입=====");
		System.out.println("ID: ");
		String id = sc.next();
		System.out.println("PW: ");
		String pw = sc.next();
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Birth: ");
		String birth = sc.next();

		// DB연결해서 insert

		// try-catch-finally
		// 예외처리문 - 프로그램 실행 오류가 발생하여 예기치 못한 상황에 대응하기위해 필요
		// try : 예외가 발생할 가능성이 있는 실행문
		// catch : 예외 처리 문장 -> 예외가 발생했을때 어떻게 대처할지
		// finally : 예외 처리 후 무조건 실행하는 실행문장
		try {
//			1. ojdbc6.jar 외부 라이브러리 추가
//		-- 프로젝트 오른쪽 마우스 -> build path -> configure build path -> Library tab -> Add external Jars
//			2. Java와 DB를 연결해줄 통로 -> OracleDriver클래스가 진행

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			3. DB에 접속(접속하기 위한 url , user, pw 정보 필요)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, user, dbpw);
			if (conn != null) {
				System.out.println("Connected Succesfully");
			} else {
				System.out.println("Connection Fail");
			}
			
//			4. SQL 문장 작성
//			? = 바인드변수 : 성능향상을 위해서 Soft Parsing을 한다
			String sql = "insert into jdbc_member values (?,?,?,?)";

//			5. SQL검사해서 실행할 수 있는지 판단
			psmt = conn.prepareStatement(sql);

//			6. 바인드변수(?) 에 값 채우기
//			psmt.setInt(0, 0);   setInt는 정수값 받고, setString은 문자열 값을 받는다, setDouble, setDate 등 많음.
			// (순서, 값);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, birth);

//			7. SQL문장 실행
			int row = psmt.executeUpdate(); 
			//executeUpdate() = int로 값을 반환함
			// 반환값이 Int 인 이유는 영향받은(affected row) 행의 숫자를 출력하기 위해서
			//Insert, Update, Delete는 모두 테이블에 변화를 주기떄문에 executeUpdate()를 사용하여 실행한다.
			
//			8. 실행 결과 확인
			if (row > 0) {
				System.out.println("insert 성공");
			} else {
				System.out.println("insert 실패");
			}

		} catch (Exception e) {
			e.printStackTrace(); // 에러가 왜 났는지 확인해줌
		} finally { // try에서 끝나던 catch 에서 끝나던 무조건 실행
			try {
//			9. 문닫기 close
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			System.out.println("회원가입 프로그램 종료");
		}
	}
}
