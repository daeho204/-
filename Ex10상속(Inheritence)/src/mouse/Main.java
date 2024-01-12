package mouse;

public class Main {
	public static void main(String[] args) {
		//Mouse클래스(설계도)를 통해서 Mouse객체 생성 (객체생성 시 , new 필요)
		// 모든객체는 생성자 메소드가 필요하다
		Mouse mouse = new Mouse();

		mouse.leftClick();
		mouse.rightClick();
		
		System.out.println();
		
		//WheelMouse 객체 생성
		//WheelMouse 가 Mouse클래스를 상속받았기 때문에 
		//leftClick , rightClick 메소드 없이도 사용가능
		WheelMouse whMouse = new WheelMouse();
		whMouse.leftClick();
		whMouse.rightClick();
		whMouse.wheel();
		
		System.out.println();
		
		//SmartMouse 객체생성
		SmartMosue smMouse = new SmartMosue();
		//오버로딩중복정의 오버라이딩재정의
		//오버라이딩이 된 leftClick, rightClick
		smMouse.leftClick();
		smMouse.rightClick();
		smMouse.wheel();
		smMouse.smart();
		
	}
}
