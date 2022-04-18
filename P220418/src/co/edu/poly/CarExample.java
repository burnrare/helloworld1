package co.edu.poly;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 8; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽, 재생 타이어로 교체");
				car.frontLeftTire = new Tire("앞 왼쪽", 3);
				break;
			case 2:
				System.out.println("앞 오른쪽, 중고 타이어로 교체");
				car.frontRightTire = new Tire("앞 오른쪽", 4);
				break;
			case 3:
				System.out.println("뒤 왼쪽, 한국 타이어로 교체");
				car.backLeftTire = new HanKookTire("뒤 왼쪽", 12);
				break;
			case 4:
				System.out.println("뒤 오른쪽, 금호 타이어로 교체");
				car.backRightRire = new KumhoTire("뒤 오른쪽", 12);
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" ----------------------------- \n");
		}
	}
}
