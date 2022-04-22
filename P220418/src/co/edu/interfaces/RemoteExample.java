package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
		
		// 개발 코드 페이지
		// 상속 관게에서는 부모 클래스의 참조 변수를 자식클래스의 인스턴스가 할당.
//		RemoteControl rc = new RemoteControl(); // 인스턴스를 만들 수 없다
		RemoteControl rc = new Television(); // RemoteControl을 구현하는 Television
		
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		rc.abjustScreen();
		
		System.out.println("------------------------------");
		rc = new Audio();
		
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		
		System.out.println("-----------------------------");
		
		RemoteControl.changeBattery();
	}
}
