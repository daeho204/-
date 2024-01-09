package ex1229;

import java.util.Scanner;

public class Ex10for문예제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		
		for (int i = 1; i < num; i++) {
			
			if(num % i == 0) {
				
				System.out.print(i + "\t");
			}
			
		}
	}

}
