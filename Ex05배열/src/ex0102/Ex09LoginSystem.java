package ex0102;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09LoginSystem {

	public static void main(String[] args) {
//		회원가입/로그인 시스템
		Scanner sc = new Scanner(System.in);

		// 회원 id,pw 저장할 배열 생성
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int count = 0;

		while (true) {
			System.out.print("1. 회원가입  2.로그인  3.종료 >> ");

			int menu = sc.nextInt();

//				회원가입할때마다 아이디, 비밀번호 배열에 회원의 정보를 저장
//				3명 초과시 회원가입 불가하게끔 해주세요
			if (menu == 1) {
				for (int i = 0; i < pw_array.length; i++) {
					

					System.out.println("====회원가입====");
					if (count < 3) {
						System.out.println("ID 입력 : ");
						String id = sc.next();
						id_array[count] = id; // count의 번호에 일치하는 인덱스에 값 저장

						System.out.println("PW 입력 : ");
						String pw = sc.next();
						pw_array[count] = pw;

						System.out.println("입력된 아이디: " + id_array[i] + "입력된 패스워드: " + pw_array[i]);
						System.out.println("회원가입 성공");
						System.out.println(id);
						count++;
						break;
					} else {
						System.out.println("회원가입 불가");
						break;
					}

				}

			} else if (menu == 2) {
				System.out.println("====로그인====");

//				아이디와 비밀번호가 일치하는 회원이 있다면 로그인 성공 
//				일치하지 않는다면 로그인 실패

				System.out.println("ID 입력 : ");
				String id = sc.next();

				System.out.println("PW 입력 : ");
				String pw = sc.next();

				// 로그인 실패를 알기위한 변수생성
				boolean isCheck = true;

				for (int j = 0; j < count; j++) {

					if (id_array[j].equals(id) && pw_array[j].equals(pw)) {
						System.out.println("로그인 성공");
						isCheck = false;
						break;
					}

				}
				if (isCheck) {
					System.out.println("로그인 실패");
				}

			} else if (menu == 3) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("정확한 숫자를 입력하세요");
			}
		}
		System.out.println("입력된 아이디: " + Arrays.toString(id_array) + "입력된 패스워드: " + pw_array);

	}

}
