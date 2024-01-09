package ex1227;

public class Ex01단순if문 {

	public static void main(String[] args) {
//		조건문
//		조건식을 만족하는 경우에 지정된 코드를 실행하고, 아닌경우에는 무시
		
//		단순if문
//		if(true) --> 코드실행 --> 끝
//		if(false) --> 끝
//		if(조건식) {실행할 코드};
		
		int age = 15;
		if(age>20) {
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램 종료.");
	}

}
