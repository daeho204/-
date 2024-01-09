package javaFestDay2;

import java.util.Scanner;

public class Day2Q2 {

	public static void main(String[] args) {
		// ab 출력
		// a-b출력
		// ab 둘다 0이면 프로그램 종료
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("A 입력 >>  ");
			int numA = sc.nextInt();
			System.out.print("B 입력 >>  ");
			int numB = sc.nextInt();
			int sub = numA - numB;
			if (numA == 0 && numB == 0) {
				break;
			}
			System.out.print("결과 >> " + sub);
			System.out.println();

		}

	}

}
