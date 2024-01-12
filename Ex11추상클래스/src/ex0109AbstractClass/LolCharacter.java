package ex0109AbstractClass;

public abstract class LolCharacter {

	String name;
	String position;
	
	
	
	//생성자 메소드 -> 객체 생성 시 name과 position을 초기화
	//- 객체가 생성되는 순간(new)에 자동으로 호출되는 메소드
	//=new Animal (생성자메소드);
	//특징1. 리턴타입이 없다. void도 적지않음
	//특징2. 생성자 메소드의 이름은 클래스의 이름과 동일
	//      생성자 메소드를 여러개 만들면 오버로딩(중복정의) - 매개변수 타입,순서,개수가 달라야함!
	//특징3. 생성자 메소드는 new키워드를 통해 이루어지며, 객체 생성할 때 한번만 호출
	//생성자는 자식클래스에서 super라고도 불림.
	public  LolCharacter(String name, String position) {
		this.name = name;
		this.position = position;

	}
	
	//공격메소드
	//각 캐릭터별로 공격의 형태가 다르기때문에, 각 구현클래스에서 구현할 수 있도록 추상메소드로 구현
	public abstract void  q();
	public abstract void e();
	public abstract void r();
	
	
	//방어메소드
	//모든 캐릭터가 가지고 있을 방어 메소드라서 캐릭터별 오버라이딩이 필요X -> 일반메소드로 구현
	public void flash() {
		System.out.println("점멸! 빠르게 도망가기");
	}

	

	@Override
	public String toString() {
		return "Character [name=" + name + ", position=" + position + "]";
	}
	
	

}
