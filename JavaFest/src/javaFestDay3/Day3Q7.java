package javaFestDay3;

import java.util.Scanner;

public class Day3Q7 {
	public static void main(String[] args) {
		//입력한 정수의 팩토리얼 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		int sum = 1;
		for (int i = 1; i < input +1; i++) {
			sum *= i;
		}
		System.out.println(sum);
		

	}
}
