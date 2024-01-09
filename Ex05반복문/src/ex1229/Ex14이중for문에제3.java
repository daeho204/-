package ex1229;

public class Ex14이중for문에제3 {

	public static void main(String[] args) {
		
		// 1번방식
//		for (int i = 1; i < 6; i++) {
//			
//			
//			for (int j = 5; j > 0; j--) {
//				if(j > i) {
//					System.out.print("@");
//				}else {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println(" ");
//			
//		}
		
		//2번방식
		
//		for (int i = 1; i < 6; i++) {
//			for (int k = 5; k > i; k--) {
//
//				System.out.print("@");
//			}
//
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
		//3번방식
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("@");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
