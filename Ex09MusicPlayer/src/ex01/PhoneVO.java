package ex01;

//Data와 이 Data에 접근하기 위한 Getter&Setter, 그리고 초기화를 위한 생성자만 있는 클래스를 
//VO (Value Object) / DTO (Data Transfer Object) 라고 부른다
public class PhoneVO {
	private String name;
	private String phone;
	
	//지정생성자 : Constructor
	
	public String getName() {
		return name;
	}
	public PhoneVO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
