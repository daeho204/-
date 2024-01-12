package ex0110Interface;

public class Whale extends Animal implements Swimmable{
	public Whale(String name, String birth) {
		super(name, birth);
	}

	public void getNutrient() {
		System.out.println("플랑크톤을 먹어요!");
	}

	public void born() {
		System.out.println("엄마 고래의 뱃속에서 태어나요!");
	}

	public void die() {
		System.out.println("268년정도 살다가 죽어요!");
	}
	
	public void swim() {
		System.out.println("고래형");
	}
	public void breath() {
		System.out.println("수면 위로 올라와서 숨을 쉬어요!");
	}
	
}
