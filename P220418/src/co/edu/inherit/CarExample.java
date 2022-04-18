package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		Bus bus = new Bus();
		// 부모에게 상속받은 필드, 메소드
		bus.model = "45인승 버스";
		bus.drive();
		
		// 자식에서 새로 추가된 필드, 메소드
		bus.busNo = "240";
		bus.fee();
		System.out.println(bus.toString());
		
		Taxi taxi = new Taxi();
		taxi.model = "Sonata Taxi";
		taxi.drive();
		
		taxi.type = "개인 택시";
		taxi.metering();
		System.out.println(taxi.toString());
		
		// 자식 클래스의 인스턴스 => 부모 참조 변수 할당 가능
		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];
		
		Car[] cars = new Car[10];
		cars[0] = bus;
		cars[1] = taxi;
	}
}
