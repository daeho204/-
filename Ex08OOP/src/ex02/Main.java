package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 나의 Account 객체 생성 후 기본정보 4개 넣기

		Account ac = new Account();

		ac.name = "김대호";
		ac.pw = 1234;
		ac.number = "123-123-1234";
		ac.money = 1000;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.계좌정보 2.잔액확인 3.입금 4.출금 5.종료 >>> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("===== 계좌정보 ====");
				System.out.println(ac.showAccount());
			} else if (menu == 2) {
				System.out.println("===== 잔액확인 ====");
				System.out.println("잔액 : " + ac.showMoney() +"원");
			} else if (menu == 3) {
				System.out.println("===== 입금 ====");
				
				int input = sc.nextInt();
				ac.deposit(input);
				System.out.println(input + "원이 입금되었습니다.");
				
			} else if (menu == 4) {
				System.out.println("===== 출금 ====");
				int input = sc.nextInt();
				ac.withdraw(input);
				System.out.println(input + "원이 출금되었습니다.");
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}
}
