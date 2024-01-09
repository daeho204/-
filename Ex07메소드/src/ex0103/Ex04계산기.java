package ex0103;

public class Ex04계산기 {

	public static void main(String[] args) {
		
		//char Character 실험
//		char c1 = 'a';
//		char c2 = 'b';
//		Character c3 = 'a';
//		Character c4 = 'a';
//		System.out.println(c3.equals(c4));
		
//		
//		Integer num3 = 10;
//		Integer num4 = 10;
//		System.out.println(num3);
		
		//Integer나 Character로 선언하면 equals를 사용가능함.
		
		
		
		
		int num1 = 10;
		int num2 = 5;
		char op = '-';
		
		System.out.println(Cal(num1, num2, op));
		
		
		
		
		
	}

	public static int Cal(int a, int b, char c) {
		if (c == '-') {
			if (a > b) {
				return a - b;
			} else {
				return b - a;
			}

		} else if (c == '+') {
			return a + b;
		} else if (c == '*') {
			return a * b;
		} else if(c == '/'){
			return a/b;
		}else {
			return 0;
		}

	}
}
