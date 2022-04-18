package co.edu.poly;

public class Tire {

	// 필드
	public int maxRotation; // 최대 10
	public int accmulateRotation; // 누적 회적수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		super();
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		accmulateRotation++;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + "에 있는 타이어 수명은 " + (maxRotation - accmulateRotation) + "입니다.");
			return true;
		} else {
			System.out.println("***" + location + " 타이어가 터졌습니다.");
			return false;
		}
	}
}
