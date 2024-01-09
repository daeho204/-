package ex1228;

import java.util.Scanner;

public class Ex03while문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int sum = 0;
		
		while(data!=-1) {
			System.out.print("정수 입력: ");
			data = sc.nextInt();
			sum += data;
			System.out.println("누적결과 : " + sum);
			if(data==-1) {
				System.out.println("종료");
				break;
			}
			
			
		}
	}

}
