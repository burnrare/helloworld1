package co.edu.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("오디오의 볼륨을 높입니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("오디오의 볼륨을 낮춥니다.");
	}

}
