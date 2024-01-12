package ex0110Interface;

public class Parrot extends Animal implements Talkable{
	public Parrot(String name, String birth) {
		super(name, birth);
	}
	
	// Animal 클래스의 abstract method 구현
	public void getNutrient() {
		System.out.println("곡물을 먹어요!");
		
	}
	
	// Creature 클래스의 abstract method 구현
	public void born() {
		System.out.println("알에서 태어나요!");
	}
	// Creature 클래스의 abstract method 구현
	public void die() {
		System.out.println("20년 살고 죽어요!");
	}
	
	//Talkable 인터페이스의 abstract method 구현
	public void talk() {
		System.out.println("사람말을 따라해요!");
	}

}
