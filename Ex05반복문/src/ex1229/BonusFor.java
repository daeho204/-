package ex1229;

import java.util.Iterator;

public class BonusFor {

	public static void main(String[] args) {

		//내가한거
//		for (int i = 0; i < (4-i) *4 * 2 -1; i++) {
//			for (int j = 0; j < 3 - i; j++) {
//				System.out.print("@");
//			}
//			for (int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 5; j > 4 - i; j--) {
//				System.out.print("@");
//
//			}
//			for (int j = 5; j > 2 * i; j--) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//
//		}
		
		//풀이답안
		for (int i = 1; i < 8; i++) {
			if(i <= 4) {
				for(int j = 0; j < 4-i; j++) {
					System.out.print("@");
					
				}
				for(int j = 0; j < i*2 -1; j++) {
					System.out.print("*");
				}
			}else {
				for(int j = 0; j < i-4; j++) {
					System.out.print("@");
				}
				for(int j = 0; j < 15-2*i; j++) {
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}
			//삼항연산자를 사용하여 풀어도 됨
//		for(int j = 0; j < (i < 5 ? 4-i : i-4); i++) {}
//		if else 문을 사용하는대신 삼항연산자를 for문에 넣으면 코드를 간결화하여 for문 안에 for문 두줄만 더 쓰면 가능
			
	}

}
