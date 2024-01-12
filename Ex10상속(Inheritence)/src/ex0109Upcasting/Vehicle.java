package ex0109Upcasting;

public class Vehicle {
	
	String model;
	String color;
	
	public void forward() {
		System.out.println("앞으로 전진");
	}
	public void backward() {	
		System.out.println("뒤로 후진");
	}
	
	//alt + shift + s -> Generate toString : 출력기능
	// toString() : 객체가 가진 정보나 값을 문자열 형태로 return 해주는 메소드
	//오버라이드가 가능한 이유는 Object 객체를 상속받기 때문.
	@Override
	public String toString() {
		return "내 모델은: " + model + ", 차량의 색은: " + color + " 입니다";
	}
	
	
}
