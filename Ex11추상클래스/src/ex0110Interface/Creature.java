package ex0110Interface;

public abstract class Creature {
	// 동식물의 공통된 특징을 가지고 있는 가장 상위 객체 Creature생성

	// Field
	String name;
	String birth;

	// Method (Abstract)
	public abstract void born();

	public abstract void die();

	// Constructor(생성자)
	public Creature(String name, String birth) {
		this.name = name;
		this.birth = birth;
		System.out.println("내 이름은 " + name + "이고, " + birth + "에 태어났어요!");

	}

}
