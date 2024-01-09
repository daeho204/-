package javaFestDay3;

import java.util.Scanner;

public class Day3Q4 {

	public static void main(String[] args) {

		// 정수 n 을 입력받아
		// 1,2,4,7,11 과 같은 수열으로 n번째 항까지 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		// 1 2 3 4 5 6 7 8
		for (int i = 0; i < num; i++) {
			sum += i;
			System.out.println(sum);

		}

//			System.out.println(i);
//			System.out.print(i+1);
//			System.out.println(i+1+2);
//			System.out.println(i+1+2+3);

	}

}
