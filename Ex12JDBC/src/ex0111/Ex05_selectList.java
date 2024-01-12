package ex0111;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex05_selectList {
	public static void main(String[] args) {
		// 전역변수 입력
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// 회원정보를 담을 ArrayList 생성
		// 전역변수로 만들어야 While문이 반복될 때 new 키워드로 초기화 되는 일을 방지
		ArrayList<MemberVO> memList = new ArrayList<MemberVO>();

		// 회원정보 조회
//		SQL : SELECT * FROM JDBC_MEMBER;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "service";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "SELECT * FROM JDBC_MEMBER";

			psmt = conn.prepareStatement(sql);

			// select 를 ResultSet 에 저장
			rs = psmt.executeQuery();

			// while문으로 rs.next() == false가 될때까지 반복.
			while (rs.next()) {
				String id = rs.getString(1); // getString(int) 는 column index 이다. 좌측부터 1 오른쪽으로 갈수록++
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String birth = rs.getString(4);
				MemberVO vo = new MemberVO(id, pw, name, birth);
				memList.add(vo);
				// memList.add(new MemberVO(id,pw,name,birth));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		// 회원정보 출력하기(for-each문으로)
		System.out.println("=====회원정보 조회=====");
//		for (MemberVO memberVO : memList) {
//			System.out.print("ID: " + memberVO.getId() + " ");
//			System.out.print("PW: " + memberVO.getPw() + " ");
//			System.out.print("NAME: " + memberVO.getName() + " ");
//			System.out.print("BIRTH: " + memberVO.getBirth() + " ");
//			System.out.println();
//
//		}
		for (int i = 0; i < memList.size(); i++) {
			System.out.println("ID : " + memList.get(i).getId());
			
		}
	}

}
