package co.edu.poly;

public class HanKookTire extends Tire {
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accmulateRotation++;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + "에 있는 금호 타이어 수명은 " + (maxRotation - accmulateRotation) + "입니다.");
			return true;
		} else {
			System.out.println("***" + location + "금호 타이어가 터졌습니다.");
			return false;
		}
	}
	
}
