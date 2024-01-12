package ex0109Overriding;

public abstract class Animal {

	
	private String name;
	
	
	//동물의 울음소리와 노는방식은 각각 다르기때문에
	//cry(), play() 는 오버라이딩해서 자식클래스/서브클래스에서 구현하고
	//부모클래스에서는 추상메소드로 구현한다
	public abstract void cry();
	
	public abstract void play();
	
	//필드값에 접근을 위한 Getter/Setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
