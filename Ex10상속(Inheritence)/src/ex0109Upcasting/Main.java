package ex0109Upcasting;

public class Main {
	public static void main(String[] args) {
		//pg269 Upcasting
		
		//객체 생성
		Car car = new Car();
		MotorBike motorBike = new MotorBike();
		Vehicle vehicle = new Vehicle();
//		vehicle.model = "마세라티";
//		vehicle.color = "White";
//		vehicle.forward();
//		vehicle.backward();
//		System.out.println(vehicle.toString());
		
		//상속받은 필드
		car.model = "지프";
		car.color = "Red";
		
		//오버라이딩 된 메소드
		car.forward();
		car.backward();
		
		//상속받은 메소드
		System.out.println(car.toString());
		System.out.println();
		
		motorBike.model = "혼다";
		motorBike.color = "Blue";
		
		motorBike.forward();
		motorBike.backward();
		
		System.out.println(motorBike.toString());
		System.out.println("_____________________");
		
		
		
		new Driver().drive(car);
		new Driver().drive(motorBike);
		new Driver().drive(vehicle);
	
		
		
	}
	
	
}
