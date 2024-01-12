package ex0109Upcasting;

import java.util.ArrayList;
import java.util.List;

public class Downcasting {

	public static void main(String[] args) {
		//업캐스팅 (자식 -> 부모)
		Vehicle upCar = new Car();
		Vehicle upMotor = new MotorBike();
		
		//객체배열
		List<Vehicle> vehicleList = new ArrayList<Vehicle>() ;
		
		//다운캐스팅 (부모 -> 자식) : 이미 업캐스팅이 된 객체에 한해서만 가능
		Car downCar = (Car)upCar;
		MotorBike downMotor = (MotorBike)upMotor;
		
		
		//업캐스팅이 안된 부모객체를 다운캐스팅 하고자 할 때
		//Runtime error 발생 : 오류처리는 나지 않으나 실행 시 ClassCastException 오류 발생
		
		Vehicle v = new Vehicle();
//		Car downV = (Car)v;
		
		
		
		//참조 캐스팅은 Compile error 가 아닌 Runtime error로 발생하기에 개발 시 주의!
		//instanceof연산자 : 어떤 클래스 타입인지 판별해서 true/false로 반환.
		
		Car car = new Car();
		if (car instanceof Vehicle) {
			System.out.println("upcasting 가능");
			
		}else {
			System.out.println("upcasting 불가능");
		}
		
		
		//다운캐스팅
		//upCar : 업캐스팅된 객체
		//v : 업캐스팅이 안된 객체
		
		if(upCar instanceof Car) {
			System.out.println("upCar downcasting 가능");
		}else {
			System.out.println("upCar downcasting 가능");
		}
		
		if (v instanceof Car) {
			System.out.println("v downcasting 가능");
			
		}else {
			System.out.println("v downcasting 불가능");
		}
		
	}

}
