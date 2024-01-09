package ex1228;

import java.util.Scanner;

public class Ex06dowhile예제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int curWeight = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int objWeight = sc.nextInt();
		int lossWeight = 0;
		int week = 1;
		
		do {
			System.out.println("현재몸무게: " + curWeight);
			System.out.println("목표몸무게: " + objWeight);
			System.out.print(week + "주차 감량 몸무게: ");
			lossWeight = sc.nextInt();
			curWeight -= lossWeight;
			week++;
			
		}while(curWeight > objWeight);
		System.out.println(curWeight +"kg달성 축하합니다!");
		
		
		
	}

}
