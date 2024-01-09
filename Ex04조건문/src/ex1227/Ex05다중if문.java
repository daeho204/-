package ex1227;

import java.util.Scanner;

public class Ex05다중if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
//		if(8<=age && age <=13) {
//			System.out.println("초딩");			
//		}
//		else if (14<=age && age <=16) {
//			System.out.println("중딩");
//		}
//		else if (17<=age && age <=19) {
//			System.out.println("고딩");
//		}
//		else if( 20 <= age) {
//			System.out.println("성인");
//		}
		if(8<=age && age <=13) {
			System.out.println("초딩");			
		}
		else if ( age <=16) {
			System.out.println("중딩");
		}
		else if ( age <=19) {
			System.out.println("고딩");
		}
		else if( 20 <= age) {
			System.out.println("성인");
		}
		
		

	}

}
