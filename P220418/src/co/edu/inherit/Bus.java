package co.edu.inherit;

public class Bus extends Car {
	String busNo;
	
	public Bus() {
		super(); // super => 부모 생성자가 가지고 있는 것들을 호출하겠습니다 
		System.out.println("Bus() 생성자 호출");
	}
	
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	@Override // 부모 메소드에서 상속받은 걸 재정의합니다
	public void drive() { // int a < 를 넣게 되면 부모가 가지고 있는 메소드의 규칙과 다르다고 뜬다
		System.out.println("버스가 운행을 합니다");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + "\n" + super.model + "]";
//		return super.toString();
	}
	
}
                            