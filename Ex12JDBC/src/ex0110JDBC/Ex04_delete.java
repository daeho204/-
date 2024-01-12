package ex0110JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_delete {

	public static void main(String[] args) {

		// 전역변수
		PreparedStatement psmt = null;
		Connection conn = null;
		
		// 회원탈퇴 : 아이디,pw 입력 받아서 회원 삭제 진행
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원탈퇴=====");
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("PW: ");
		String pw = sc.next();

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "service";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);
			if (conn != null) {
				System.out.println("Login Success");
			} else {
				System.out.println("Login Fail");
			}

			String sql = "Delete from jdbc_member where id=? and pw=?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println(row + " affected line");
				System.out.println("회원탈퇴 완료");
			} else {
				System.out.println("회원탈퇴 불가");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		System.out.println("시스템종료.");

	}

}
