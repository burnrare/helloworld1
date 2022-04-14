package co.edu;
// 클래스: 실제 생활에 있는 객체를 도면으로, 그리고 도면을 따라서 제작한 것
// Object -> Class -> Instance
// 추상화 씨~ -> 필요한 부분만을 정리한다
public class Television {
	
	// 속성 -> 필드
	String company; // 만든 회사
	String model; // 모델명
	int price; // 가격
	String color; // 색상
	
	
	// 기능 -> 메소드(반환 유형, 메소드명, 매개 변수)
	void turnOn() {
		System.out.println("텔레비젼을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("텔레비젼을 끕니다.");
	}
	
	void changeChannel(int channel) {
		System.out.println(channel + " 채널로 이동합니다.");
	}

}
