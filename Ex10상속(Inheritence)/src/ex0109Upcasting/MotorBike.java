package ex0109Upcasting;

public class MotorBike extends Vehicle {

	@Override
	public void forward() {
		System.out.println("🚲 앞으로 전진");
	}

	@Override
	public void backward() {
		System.out.println("🚲 뒤로 후진");
	}
	
}
