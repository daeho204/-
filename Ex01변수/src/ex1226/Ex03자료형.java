package ex1226;

public class Ex03자료형 {

	public static void main(String[] args) {
		
//		1) 기본자료형
//		--논리형 : 참/거짓을 저장하는 자료형
//		1byte
		boolean bool = true; //false
		
//		--문자형 : 글자를 저장 가능한 자료형
//		문자를 작은 따옴표 안에 사용
//		문자 한개만 저장가능
//		아스키코드 기준으로 저장
//		2byte : 0 ~ 2^16
//		아스키코드가 0부터 시작하기때문에 양수만 저장함
		char grade = 101;
		System.out.println(grade); //아스키코드에 의해 101을 넣었을 때 그에 상응하는 값인 e가 출력
		
//		--정수형
//		byte
//		1byte : 8bit : -128 ~ 127 까지 저장 가능
		
//		short
//		2byte : 16bit : -32,768 ~ 32767 까지 저장 가능
	
//		int
//		4byte : 32bit 
		
//		long
//		8byte : 64bit
//		자바가 기본적으로 int로 인식하기때문에 숫자 뒤에 L을 붙여서 강제로 인식시켜야함
//		ex) long popul = 700000000000L;
		
//		double
//		8byte
//		double pie = 3.1415926;
		
		
//		float
//		4byte
//		뒤에 f를 붙여서 강제로 float로 만들어야함
//		ex) float pie2 = 3.14f;
		
		
//		참조자료형
		
//		문자열: 큰 따옴표로 감쌈
//		용량 제한이 없다
//		String str = "Hello World"; 한줄만 저장 가능
		
		
//		CASTING
		
//		1. 자동형변환 (묵시적 형변환)
		int num1 = 10000;
		
		double num2 = num1;
		
		System.out.println(num2);
		
		double num4 = 1.4123124;
		int num5 = (int)num4;
		System.out.println(num5);
		
//		위의 자동/강제 형변환은 "기본자료형" 끼리만 가능하다.
		String year = "2023";
		//int y = (int)year;// 불가능
		int y = Integer.parseInt(year);
		System.out.println(year);
		

		
		

		

	}

}
