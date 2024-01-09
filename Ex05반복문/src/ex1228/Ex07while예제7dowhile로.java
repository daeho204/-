package ex1228;

import java.util.Random;
import java.util.Scanner;


public class Ex07while예제7dowhile로 {

	public static void main(String[] args) {
		Random ran = new Random();

		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("===game start");

		int ans = 0;
		
		
		do {
			int num1 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
			int num2 = ran.nextInt(1, 100); // 0-10까지 정수중 랜덤출력
			int sum = num1 + num2;
			System.out.print(num1 + " + " + num2 + " = ");
			ans = sc.nextInt();
			
			if(ans == sum) {
				System.out.println("success");
		
			} else {
				System.out.println("fail");
				System.out.println("continue? >>>");
				str = sc.next();
				if(str.equals("N")) {
					break;
				}
			}
			
			
		}while(true);
	}
}
