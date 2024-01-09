package javaFestDay2;

import java.util.Scanner;

public class Day2Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int cur = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int obj = sc.nextInt();
		int n = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(n + "주차 감량 몸무게: ");
			int sub = sc.nextInt();
			cur -= sub;
			n++;
			
			if(cur <= obj) {
				System.out.println(cur+ "kg달성축하");
				break;
			
			
		}
		
		}

	}

}
