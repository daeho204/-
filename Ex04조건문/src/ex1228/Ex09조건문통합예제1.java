package ex1228;

import java.util.Scanner;

public class Ex09조건문통합예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.printf("메뉴를 고르세요.%n 1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >>>> ");
		int menu = sc.nextInt();
		
		//Switch 문 사용
		
//		switch (menu) {
//		case 1:
//			money = money - 700;
//			break;
//			
//		case 2:
//			money = money - 1000;
//			break;
//			
//		case 3:
//			money = money - 500;
//			break;
//			
//		default:	
//			System.out.println("Wrong menu");
//		}
		
		if(menu > 3 || menu < 0) {
			System.out.println("잘못된 메뉴입니다.");			
		}
		else if (menu == 1) {
			money -= 700;
			
		}
		else if (menu == 2) {
			money -= 1000;
		}
		else if (menu == 3) {
			money -= 500;
		}
		
		
		
		System.out.println("잔돈 : " + money);

	}

}
