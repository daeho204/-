package javaFinal;

public class Q22 {

	public static void main(String[] args) {
//		다음과 같은 결과를 출력하세요
//		     *
//		    **
//		   ***
//		  ****
//		 ***** 
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}System.out.println();
		}
	}

}
