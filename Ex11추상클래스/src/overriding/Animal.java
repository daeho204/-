package overriding;

public class Animal {
//	캡슐화: 데이터를 외부로부터 보호
//	목적 1. Data Protection  -> 외부로부터 클래스에 정의된 속성과 기능들을 보호
//	목적 2. Data Hiding -> 내부의 동작을 감추고 외부에는 필요한 부분만 노출
	
//	캡슐화 방법 : 접근제한자
	//public: 제한X
	//protected: 동일한 패키지, 다른 패키지의 하위클라스
	//default: 동일한 패키지
	//private: 동일한 클래스
	
	private String name;

	//cry(), play() 메소드 설계
	public void cry() {
		System.out.println("울다");
	}
	
	public void play() {
		System.out.println("놀다");
	}
	
	//필드값에 접근을 위한 Getter/Setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
