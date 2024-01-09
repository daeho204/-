package ex02;

public class Account {
	
	//생성자 : 객체를 생성하는 메소드
	//특징 1 : 생성자의 이름은 클래스의 이름과 동일함
	//특징 2 : 리턴타입이 존재하지 않는다
	//특징 3 : 객체를 생성할 떄 "한번만" 호출된다
	//187pg
	//기본 생성자 Default 생성자
	public Account() {
		
	}
	
	//field
	String name;
	String number;
	int pw;
	int money;
	
	//method
	
	//계좌정보를 가진 메소드
	public String showAccount() {
		return name + "\n" + number;
		
	}
	//현재 가진 금액을 돌려주는 메소드
	public int showMoney() {
		return money;
	}
	
	//매개변수로 입금을 받아서 내 금액에 누적시키는 메소드 (deposit)만들기
	public void deposit(int money) {
		this.money += money; //this 는 현재 클래스를 지칭한다.
		
	}
	//매개변수로 출금금액을 내 금액에서 차감시키는 메소드 만들기 (withdraw)
	public void withdraw(int money) {
		this.money -= money;
	}
}
