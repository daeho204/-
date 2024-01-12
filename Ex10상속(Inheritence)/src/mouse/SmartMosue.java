package mouse;

public class SmartMosue extends WheelMouse{
	//인체공학마우스 클래스 생성
	// 좌클릭 + 우클릭 + 마우스휠 + 피로감소 기능을 보유
	
	public void smart() {
		System.out.println("피로감소 기능!");
	}
	
	//오버로딩중복정의 오버라이딩재정의
	//휠마우스 객체에서 좌클릭/우클릭 기능을 받았으나
	//스마트마우스만의 기능(더블클릭)으로 재정의 (오버라이딩)
	
	public void leftClick() {
		System.out.println("더블좌클릭");
	}
	public void rightClick() {
		System.out.println("더블우클릭");
	}
}
