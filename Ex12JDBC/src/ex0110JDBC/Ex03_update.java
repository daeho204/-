package ex0110JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex03_update {

	public static void main(String[] args) {
		
		//지역변수
		Connection conn = null;
		PreparedStatement psmt = null;
		//회원정보 수정 : 입력한 pw,name,birth 를 기존정보에서 수정하는 역할
		//SQL문장 : update from jdbc_member set column = ? 
		
//		사용자가 update하고싶은 정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원정보 수정 =====");
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("PW :");
		String pw = sc.next();
		System.out.print("NAME :");
		String name = sc.next();
		System.out.print("BIRTH :");
		String birth = sc.next();
		
		try {
//			oracleDriver 임포트
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "service";
			String dbpw = "12345";
			
			//연결시도
			conn = DriverManager.getConnection(url, dbid, dbpw);
//			if(conn!=null) {
//				System.out.println("login success");
//			}else {
//				System.out.println("login fail");
//			}
			
			//실행할 쿼리문 sql에 담기
			String sql = "update jdbc_member set PW = ?, NAME = ?, BIRTH=? where ID = ?";
		
			//sql 문장검사
			psmt = conn.prepareStatement(sql);
			
			//바인드변수 채워넣기
			psmt.setString(1, pw);
			psmt.setString(2, name);
			psmt.setString(3, birth);
			psmt.setString(4, id);
			
			int row = psmt.executeUpdate();
			if(row>0) {
				System.out.println(row + " affected row");
				System.out.println("회원번호 수정 완료!");
				System.out.println("수정된 비밀번호는 " + pw + ", 이름은 " + name + ", 생일은 " + birth + " 입니다.");
			}else {
				System.out.println("Update failed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null)psmt.close();
				if(conn != null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		System.out.println("회원정보 수정 프로그램 종료");

		
	}

}
