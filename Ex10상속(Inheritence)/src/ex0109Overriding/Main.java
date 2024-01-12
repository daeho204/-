package ex0109Overriding;

public class Main {

	public static void main(String[] args) {
		
		//Animal Class
		//Animal 클래스가 추상클래스로 변환되었기 때문에 인스턴스화 불가능!
		// new 키워드 사용 불가능 = 객체 생성 불가능
//		Animal a = new Animal();
//		a.cry();
//		a.play();
		System.out.println();
		
		//Dog Class
		Dog d = new Dog();
		d.cry();
		d.play();
		d.setName("멍멍이"); //set으로 name에 이름지정
		System.out.println(d.getName()); //get으로 name에 저장한 이름 가져오기
		System.out.println();
		
		//Cat Class
		Cat c = new Cat();
		c.cry();
		c.play();
		c.setName("야옹이");
		c.setName("야옹이");
		System.out.println(c.getName());

	}

}
