package javaFinal;

import java.util.Random;
import java.util.Scanner;

public class Q29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 1;
		for (int i = 0; i < 10; i++) {
			int num1 = ran.nextInt(1,11);
			int num2 = ran.nextInt(1,11);
			int result = num1 + num2;
			System.out.print(num1 + "+" + num2 + "=");
			int ans = sc.nextInt();
			if(ans == result) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("FAIL...");
				count++;
				System.out.println(count);
			}
			if (count > 5) {
				System.out.println("GAME OVER");
		}
		
			
		}
		
	}

}
