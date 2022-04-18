package co.edu.statics;


public class Singleton {

	Car car;
	
	private static Singleton singleton = new Singleton(); // 선언, 생성자 private이 붙기 전에는 바로 접근됐으나 private가 붙으면 getInstance를 이용해서야만 객체 만들 수 잇다
	
	private Singleton () { // 외부에서는 이쪽으로 침투 불가
		
	}
	
//	static Singleton getInstance() { // 동일한 패키지에서의 다른 클래스에서는 접근 가능
//		return singleton;
//	}
	
	public static Singleton getInstance() {
		return singleton;
	} // public을 통해 다른 패키지에서도 접근 가능
	
	
	
 }
