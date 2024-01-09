package ex;

public class Music {

	// 접근제한자 : 외부로부터 접근하는 범위를 지정
	// 1. public - 현재 프로젝트 안에서 어디서든 접근 가능
	// 2. protected - 현재 패키지 안에서만 접근 가능, 상속 받으면 접근 가능. (클래스 앞에 못붙힘 -> 클래스 안에 작성)
	// 3. 공란 or (Default) - 현재 패키지 안에서만 접근가능.
	// 4. private - 현재 클래스 안에서만 접근가능

	private String name; // 음악제목
	private String singer; // 가수이름
	private int playTime; // 재생시간
	private String path; //경로 만들기

	// 기본생성자 : 자동생성
//	클래스명과 같고, 리턴타입 필요없고, 한번만 호출됨
//	public Music() {
//	}
	
	//사용자 정의 생성자
	//기본생성자에 매개변수를 넣어서 매개변수 중 하나라도 입력이 없다면 사용불가.
	public Music(String name, String singer, int playTime, String path) {
		this.name = name;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
		//Music 으로 받아온 정보를 this를 통해 바로 필드에 넣어주면 get set 이 필요없다.
		
	}

	// name 필드는 private 상태이기때문에 MusicPlayer에서 사용하기위해 메소드를 통해 필드에 접근
	// 바로 필드로 접근하는것은 위험하기 때문에 메소드를 만들어 매개변수 생성 후 값을 받아온다음 저장하는게 데이터보호에 유리함
	// 캡슐화라고도 불림 : Encapsulation
	

	// 외부에서 name 필드에 값을 넣을 수 있는 메소드 생성
	
	//Get Set 메소드 자동생성은 Alt + Shift + S
	
	public void setName(String name) {
		this.name = name;

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setSinger(String singer) {
		this.singer = singer;

	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;

	}
	
	//외부에서 name필드값을 가져올 수 있는 메소드 생성
	public String getName() {
		return name;
		//return this.name 도 가능
	}
	public String getSinger() {
		return singer;
		
	}
	public int getPlayTime() {
		return playTime;
		
	}

}
