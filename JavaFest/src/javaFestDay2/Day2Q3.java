package javaFestDay2;

import java.util.Random;
import java.util.Scanner;

public class Day2Q3 {

	public static void main(String[] args) {

		// 렌던정수 2개 출력
		// 두 수의 합 입력 (정답입력)
		// 정답과 두수의 합이 일치 = "Success"
		// 불일치 = "Fail"
		// if fail * 5 = Game Over

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			int num1 = ran.nextInt(0, 11);
			int num2 = ran.nextInt(0, 11);
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = ");
			int ans = sc.nextInt();
			

			if (ans == sum) {
				System.out.println("SUCCESS!");
			} else if (ans != sum) {
				System.out.println("Fail...");
				count++;
				System.out.println("카운트숫자: " + count);
				
			}

			if (count > 5) {
				System.out.println("GAMEOVER");
				break;
			}

			System.out.println(count);

		}

	}
}
