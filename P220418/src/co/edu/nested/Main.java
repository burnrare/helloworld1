package co.edu.nested;

import co.edu.nested.Outer.Inner;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();

		// instance 멤버 클래스
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();

		// static 멤버 클래스
		Outer.Inner2.method5();
		
		// static 클래스의 인스턴스 메소드 호출
		Outer.Inner2 inner2 = new Outer.Inner2(); // 내부 클래스는 이렇게 만들어요~ ^^ 외부 클래스에 있는 inner 클래스를 호출해서 만들어야 함
		inner2.method4(); // 인스턴스 메소드
		inner2.method5(); // 정적 메소드

		// instance vs static -> new로 하나를 만들어야 사용 가능한 것이 instance
        // Outer.Inner.method4();
		// outer.new Inner();

	}
}
