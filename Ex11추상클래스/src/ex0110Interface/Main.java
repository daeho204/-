package ex0110Interface;

public class Main {
	public static void main(String[] args) {
		
		//추상클래스와 인터페이스는 객체 생성 불가능(인스턴스화 불가능)
//		Animal ani = new Animal();
//		new Swimmable();
				
		
		Person kim = new Person("김대호", "3월 7일");
		kim.born();
		kim.getNutrient();
		kim.talk();
		kim.breath();
		kim.swim();
		kim.die();
	
		Parrot louis = new Parrot("제임스 고슬링", "1월 10일");
		louis.born();
		louis.getNutrient();
		louis.talk();
		louis.die();
		
		Whale w = new Whale("고래상어" , "12월 12일");
		w.born();
		w.getNutrient();
		w.breath();
		w.swim();
		w.die();
		
		
	}
}
