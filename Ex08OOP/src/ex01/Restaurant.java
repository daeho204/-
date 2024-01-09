package ex01;

public class Restaurant {
	//음식점 객체를 생성하기위한 클래스(설계도)
	
	//클래스는 필드와 메소드로 구성되어있다
	
	//필드 : 데이터를 저장할 수 있는 공간(변수) -전역변수(Member value)
	String name;
	String mainMenu;
	int price;
	
	//메소드 : 기능
	public void makeMenu() {
		System.out.println(mainMenu + "를(을) 만듭니다.");
		
	}

}
