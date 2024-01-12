package phone;

public class Main {
	public static void main(String[] args) {
		Phone p = new Phone();
		FeaturePhone fp = new FeaturePhone();
		SmartPhone sp = new SmartPhone();
		
		p.call();
		p.text();
		
		fp.call();
		fp.text();
		fp.camera();
		
		sp.call();
		sp.text();
		sp.camera();
		sp.internet();
		
	}
}
