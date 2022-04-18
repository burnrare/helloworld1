package co.edu.abstracts;

public class Main {
	public static void main(String[] args) {
		Animal animal = null; // new Animal(); // 추상 클래스는 new로 생성자를 호출할 수 없다
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		animal = new Fish();
		animal.eat();
		animal.run();
		animal.sleep();
		
	}	
}
