package co.edu.interfaces;

// 인터페이스를 구현하는 구현 Class
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV의 볼륨을 높입니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV의 볼륨을 낮춥니다.");
	}

	@Override
	public void abjustScreen() {
//		RemoteControl.super.abjustScreen(); 부모가 주는 기능
		System.out.println("TV에 화면을 조정합니다.");
	}
	
	

}
