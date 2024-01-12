package ex0109AbstractClass;

public class Garen extends LolCharacter{
	public Garen(String name, String position) {
		super(name,position);
	}
	
	public void q() {
		System.out.println("공격Q : 가붕이가 뚜벅뚜벅 뛰어가요");
	}
	
	public void e() {
		System.out.println("공격E : 가붕이가 빙글빙글 돌아요");
	}
	public void r() {
		System.out.println("공격R : 데마시아로 머리찍기!");
	}
}
