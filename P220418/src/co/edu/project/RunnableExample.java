package co.edu.project;

// 구현 클래스 명
interface Runnable {
	public void run();
}
class RunClass implements Runnable {

	@Override
	public void run() {
		
	}
	
}
public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("고양이가 달립니다 존나 귀여움"); // 익명 구현 객체
			}
			
		};
		runnable.run();
		
		runnable = () -> // 매개 변수에 있는 것을 받아서~ 람다표현식
				System.out.println("고양이가 달립니다 존나 사랑스러움"); // 익명 구현 객체		
		runnable.run();
	}
}
