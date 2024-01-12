package ex0110Interface;

public class Person extends Animal implements Talkable, Swimmable{

	public Person(String name, String birth) {
		super(name, birth);
	}

	// Animal 클래스의 abstract method 구현
	public void getNutrient() {
		System.out.println("밥을 먹어요!");

	}

	// Creature 클래스의 abstract method 구현
	public void born() {
		System.out.println("엄마 뱃속에서 태어나요!");
	}

	// Creature 클래스의 abstract method 구현
	public void die() {
		System.out.println("70년 살고 죽어요!");
	}
	
	// Talkable 인터페이스의 abstract method 구현
	public void talk() {
		System.out.println("한국어로 말해요!");
	}
	
	// Swimmable 인터페이스의 abstract method 구현
	public void swim() {
		System.out.println("자유형 배영 평영 접영");
	}
	// Swimmable 인터페이스의 abstract method 구현
	public void breath() {
		System.out.println("물 밖으로 나와서 숨을 쉬어요");
	}

}
