package javaFinal;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
//		행의 갯수를 입력받아 별 그리기
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 갯수 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i < input+1; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
