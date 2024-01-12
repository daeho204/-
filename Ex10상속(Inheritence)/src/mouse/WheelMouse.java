package mouse;

public class WheelMouse extends Mouse {

	//휠마우스의 기능 : left click, right click, wheel scroll
	//Mouse부모클래스에서 leftclick rightclick 기능 상속 후 wheel scroll 기능만 만들면 된다
	
	public void wheel() {
		System.out.println("휠 스크롤 기능!");
	}
	
	
}
