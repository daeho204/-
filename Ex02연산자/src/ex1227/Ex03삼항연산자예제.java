package ex1227;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03삼항연산자예제 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("정수를 입력하세요 :  ");
			int num1 = sc.nextInt();
			String result = (num1 % 2 == 0) ? num1 + "는(은) 짝수입니다" : num1 + "는(은) 홀수입니다";
			System.out.println(result);
			
		}
		
//		if(num1 % 2 == 0) {
//			System.out.println(num1 + "는(은) 짝수입니다.");
//		}
//		else {
//			System.out.println(num1 + "는(은) 홀수입니다.");
//		}
		
		
		
		
		
	}

	
}
