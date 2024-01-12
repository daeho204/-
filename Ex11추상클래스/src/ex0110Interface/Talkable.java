package ex0110Interface;

public interface Talkable {
	
	//Interface : 언제든 탈부착 가능한 기능들로 구성되어있다
	//말하기는 모든 동물이 가지고 있지 않고, 사람과 앵무새만 가능하기 때문에
	//추상클래스의 메소드로 만들기보다는 인터페이스로 구현하는게 나음.
	
	//인터페이스는 규칙이기때문에 공개(Public)되어 있고 추상(Abstract) 메소드이다.
	//public abstract -> 기본값(생략가능)
	
	//필드는 무무조건 public, static, final ->기본값(생략가능)
	//public int a = 100; 처럼 100이란 값이 상수인 변수만 생성가능
	
	
	public abstract void talk();
	//void talk();
}
