package javaFinal;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {
		
		//1보다 큰 정수 N을 입력하여 N!(팩토리얼) 값을 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
			
		}
		System.out.print("출력 : " + sum);
	}

}
