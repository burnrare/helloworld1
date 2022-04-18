package co.edu.inherit;

class Driver {
	public void drive(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus(); // 인스턴스
		Taxi taxi = new Taxi(); // 인스턴스
		
		Driver driver = new Driver();
		driver.drive(bus); // 매개 변수의 polymorphism
		driver.drive(taxi); // polymorphism
	}
}
