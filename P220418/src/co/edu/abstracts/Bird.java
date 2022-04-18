package co.edu.abstracts;

public class Bird extends Animal { // 처음에 오류가 뜬다면 추상 메소드가 두 개 있기 때문

	@Override
	public void eat() {
		System.out.println("새가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		System.out.println("새가 날아갑니다.");
	}

}
