package co.edu.poly;

public class Car {
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightRire = new Tire("뒤 오른쪽", 4);

	public int run() {
		
		System.out.println("자동차가 부릉부릉.");
		
		stop();
		
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		};
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		};
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		};
		if(backRightRire.roll() == false) {
			stop();
			return 4;
		};
		
		return 0;
		
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
