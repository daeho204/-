package ex1227;

import java.util.Scanner;

public class Ex03삼항연산자예제2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번재 정수 입력: ");
		int num2 = sc.nextInt();
		
		int sub1 = num1 - num2;
		int sub2 = num2 - num1;
		int result = (num1 > num2) ? sub1 : sub2;
		System.out.println("두 수의 차: " + result);
		
	
		
				
		
		
		
	}

}
