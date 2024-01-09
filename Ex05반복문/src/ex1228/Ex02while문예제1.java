package ex1228;

import java.util.Scanner;

public class Ex02while문예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
//		while (num =< 10) {
//			
//			System.out.print("정수 입력: ");
//			num = sc.nextInt();
//		}
		
		while(true ) { //무한반복문에는 탈출 조건이 필요함.
			System.out.print("정수 입력: ");
			num = sc.nextInt();
			
			if(num > 10) { //while문을 멈추기 위한 조건문
				break;
			}
			
		}
		System.out.println("종료");
	

	}

}
