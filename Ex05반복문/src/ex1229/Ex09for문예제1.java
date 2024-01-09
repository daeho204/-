package ex1229;

import java.util.Iterator;

public class Ex09for문예제1 {

	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			int result = 2 * i;
//			System.out.println("2*" + i + "=" + result);
//			
//		}
		for (int i = 1; i < 10; i++) {
			
			for (int j =1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");

		}
		
	}

}
