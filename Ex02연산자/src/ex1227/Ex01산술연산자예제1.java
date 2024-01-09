package ex1227;
import java.util.Scanner;

public class Ex01산술연산자예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "첫번째 정수 입력: ";
		System.out.print(str1);
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		double div = (double)num1 / num2;
		
		System.out.println("더한 결과 값: " + sum);
		System.out.println("뺀 결과 값: " + sub);
		System.out.println("곱한 결과 값: " + mult);
		System.out.println("나눈 결과 값: " + div);
		
//		String str1 = "첫번째 정수 입력: ";
//		String str2 = "두번째 정수 입력: ";
//		
//		System.out.print(str1);
//		int num1 = sc.nextInt();
//		System.out.print(str2);
//		int num2 = sc.nextInt();
//		System.out.println("더한 결과 값: " + (num1 + num2));
//		System.out.println("뺀 결과 값: " + (num1 - num2));
//		System.out.println("곱한 결과 값: " + (num1 * num2));
//		System.out.println("나눈 결과 값: " + (num1 / num2));
		
		
		
		
		
		
		

	}

}
