package ex0109Overriding;

public class Dog extends Animal{
	//오버라이딩(재정의): 부모클래스의 메소드의 동작방법을 자식클래스에 맞게 변경하는것
		//메소드의 형태(이름,매개변수 타입, 순서, 개수)가 동일해야함.
		
		//오버라이딩 하고싶은 메소드만 진행: cry(), play()
		//오버라이딩 자동완성 : alt + shift + s -> Override/Implement Methods 선택
	
	@Override
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public void play() {
		System.out.println("터그놀이");
	}

	
	
}
