package ex0109Upcasting;

public class Driver {
	//운전자 클래스
	
	//drive메소드 : 운전자가 운전할 수 있는 객체를 매개변수로 받아서 전진 후진
//	public void drive(Car car) {
//		car.forward();
//		car.backward();
//	}
	
	//오버로딩(중복정의)
//	public void drive(MotorBike motorBike) {
//		motorBike.forward();
//		motorBike.backward();
//	}
	//다형성 적용 전 --> ver1
	//ver1 에서 운전자 클래스는 Car, MotorBike등 각각의 객체를 매개변수로 전달받아서 운전중
	// == 운전자는 Car, MotorBike객체에 의존을 하고있다
	//== Driver객체가 다른 클래스들(Car,MotorBike)과 직접적인 관계가 있다는 뜻
	//== 객체들간의 결합도가 높다고 표현 가능
	// --> 객체지향에서는 결합도가 높으면 유지보수가 힘들다
	
	//객체지향 프로그램은 결합도를 낮추고 느슨한 관계를 유지해서 유지보수가 용이하게 프로그램을 설계하는것에 그 의의를 둔다.
	
	//다형성을 적용 --> ver2
	//운전자 클래스는 각 구현 클래스가 아닌 상위클래스(Vehicle)을 매개변수로 받아서 운전
	//어떤 이동수단이 오더라도 코드를 변경할 필요가 없음.
	
	//운전자가 각자의 클래스에 직접 연결되는것이 아니라서 결합도가 낮아지고
	//클래스에 변경이 생겨도 영향이 적어진다.
	public void drive(Vehicle vehicle) {
		vehicle.forward();
		vehicle.backward();
	}
}
