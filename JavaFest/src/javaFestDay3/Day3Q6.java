package javaFestDay3;

import java.util.Scanner;

public class Day3Q6 {
	public static void main(String[] args) {
		//단수와 곱해지길 원하는 수를 입력해서 다음과 같이 출력
//		단수입력 : 2
//		어느수까지 출력: 6
//		2단
//		2*1 = 2
//		2*2 = 4
//		2*3 = 6
//		2*4 = 8
//		2*5 = 10
//		2*6 = 12
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 :");
		int num = sc.nextInt();
		System.out.print("어느수까지 출력 :");
		int num1 = sc.nextInt();
		System.out.println(num +"단");
		
		for (int i = 1; i < num1+1; i++) {
			int result = num * i;
			System.out.println(num + " * " + i + " = " + result);
			
		}
	}

}
