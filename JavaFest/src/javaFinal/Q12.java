package javaFinal;

public class Q12 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인: " + result);
	}
	
	public static boolean isDivide(int a, int b) {
		if(a % b == 0) {
			return true;
		}else {
			return false;
		}
	}

}
