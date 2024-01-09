package ex1227;

import java.util.Scanner;

public class Ex02산술연산자예제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 :  ");
		int totalSecond = sc.nextInt();
		int hour = totalSecond / 3600;
		int min = (totalSecond % 3600) / 60;
		int sec = (totalSecond % 3600) % 60;
//		int sec = totalSecond % 60;
	
		
		System.out.print(hour+"시"+min+"분"+sec +"초");
		
		
		
	}

}
