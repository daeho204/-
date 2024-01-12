package ex0109AbstractClass;

public class Ahri extends LolCharacter{

	public Ahri(String name, String position) {
		super(name, position);
	
	}

	@Override
	public void q() {
		System.out.println("공격Q : 구슬을 던져서 공격");
		
	}

	@Override
	public void e() {
		System.out.println("공격E : 구슬을 던져서 매혹");		
	}

	@Override
	public void r() {
		System.out.println("궁극기R : 혼령질주");
		
	}
	
	
	

	

}
