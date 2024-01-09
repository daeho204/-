package ex1228;

import java.util.Scanner;

public class Ex04while문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int countodd = 0;
		int counteven = 0;

		while (true) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();

			if (num == -1) {
				System.out.println("END");
				break;
			} 
			
			if (num % 2 == 0) {
				counteven++;
			} 
			
			else {
				countodd++;
			}

			System.out.println("짝수의 갯수 : " + counteven);

			System.out.println("홀수의 갯수 : " + countodd);

		}
		
	}

}

//while (num != -1) {
//	System.out.print("숫자입력 : ");
//	num = sc.nextInt();
//
//	if (num % 2 == 0) {
//		counteven++;
//	} 
//	
//	else {
//		countodd++;
//	}
//
//	System.out.println("짝수의 갯수 : " + counteven);
//
//	System.out.println("홀수의 갯수 : " + countodd);
//
//}
//System.out.println("END");