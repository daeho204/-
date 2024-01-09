package ex1228;

import java.util.Random;
import java.util.Scanner;

public class Ex07while예제4 {

	public static void main(String[] args) {

		// 랜덤 사용법
		Random ran = new Random();

		Scanner sc = new Scanner(System.in);

		int ans = 0;
//		int num1 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
//		int num2 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
//		int num = ran.nextInt(10) + 1; //0-10까지 정수중 랜덤출력 (다른방법)
//		int sum = num1 + num2;
		String str = "";
		System.out.println("===Plus Game===");

//		System.out.println(sum);

		while (true) {
			int num1 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
			int num2 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
			int sum = num1 + num2;
			System.out.print(num1 + " + " + num2 + " = ");
			ans = sc.nextInt();

			if (ans == sum) {
				System.out.println("success");

			} else {
				System.out.println("fail");
				System.out.print("계속하시겠습니까? >> ");
				str = sc.next();

				if (str.equals("N")) { // str == "N"도 가능 (신버전에서는)
					break;

				}
			}

		}
	}
}
