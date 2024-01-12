package ex0109AbstractClass;

public class Main {
	public static void main(String[] args) {
		Ahri a = new Ahri("아리", "미드");
		System.out.println(a.toString());
		a.q();
		a.e();
		a.r();
		a.flash();
		
		Garen g = new Garen("가렌", "탑");
		System.out.println(g);
		g.q();
		g.e();
		g.r();
		a.flash();
	}
}
