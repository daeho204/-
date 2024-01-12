package overriding;

public class Cat extends Animal{
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void play() {
		System.out.println("쥐잡기");
	}

}
