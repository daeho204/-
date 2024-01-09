package ex01;

public class HanRiver {

	public static void main(String[] args) {
		//음식점 객체 생성하기
		Restaurant r1 = new Restaurant();
		
		r1.name = "소문난집";
		r1.mainMenu	= "바지락칼국수";
		r1.price = 9000;
		
		System.out.println(r1.name);
		System.out.println(r1.mainMenu);
		System.out.println(r1.price);
		
		r1.makeMenu();
		
		Restaurant r2 = new Restaurant();
		r2.name = "맛난집";
		r2.mainMenu = "맛난국수";
		r2.price = 10000;
		
		System.out.println(r2.name);
		System.out.println(r2.mainMenu);
		System.out.println(r2.price);
		
		r2.makeMenu();
	}

}
