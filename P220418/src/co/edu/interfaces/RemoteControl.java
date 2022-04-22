package co.edu.interfaces;

public interface RemoteControl {
	
	public static final int Max_Volume = 10;
	
	public void turnOn(); // 추상 메소드
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	public default void abjustScreen() { // default 메소드 한 곳에서만 이 기능을 사용하고 싶을 때
		System.out.println("화면을 조정합니다.");
	};
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
