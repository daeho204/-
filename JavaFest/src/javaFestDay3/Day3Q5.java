package javaFestDay3;

import java.util.Scanner;

public class Day3Q5 {

	public static void main(String[] args) {
//		8자리 정수를 입력받아 반복문을 활용하여 입력받은 값의 합을 구하시오
//		ex) 정수입력 : 12345  합은 :15
		
//		System.out.println(123%10);
//		System.out.println(123/10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(true) {
			sum += num % 10;
			num = num/10;
			
			if(num == 0) {
				System.out.println(sum);
				break;
			}
		}
		
		
	}

}
