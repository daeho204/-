package javaFinal;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 갯수 : ");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			
			for (int j = input; j > i; j--) {
				
				System.out.print("*");

			}System.out.println();
		}
		
	}

}
