package ex0104;

public class Ex08중복정의 {
	public static void main(String[] args) {
		//pg204, 208
		//메소드 오버로딩 (Method Overloading)
		
		int result1 = plus(10,20);
		int result2 = plus(10,20,30);
		int result3 = plus(5.1,3.14);
		
		System.out.println("숫자의 총합 : " + result1);
		System.out.println("숫자의 총합 : " + result2);
		System.out.println("숫자의 총합 : " + result3);
	}
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int plus(int a, int b, int c) {
		return a+b+c;
	}
	//메소드의 리턴타입 (이경우 int) 는 오버로딩과 전혀 상관없다. --> double 로 바꾼다고 해결되지 않음
	public static int plus(double a, double b) {
		return (int)(a + b);
	}
	

}
