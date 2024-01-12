package ex0111;

public class MemberVO {

	// VO (ValueObject) : 값 자체를 나타내는 객체(필드, 생성자 필수, getter/setter 등 다른구성요소 가능)
	// DTO (Data Transfer Object : 데이터를 전달하는 객체(필드, getter/setter로만 이뤄져있음)

	// 필드 (회원정보 : id, pw, name, brith)
	private String id;
	private String pw;
	private String name;
	private String birth;

	// 생성자 메소드 -> MemberVO 객체 생성시 필드 초기화
	public MemberVO(String id, String pw, String name, String birth) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
	}
	
	//회원의 정보를 가져오기 위한 Getter메소드
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}
	

}
