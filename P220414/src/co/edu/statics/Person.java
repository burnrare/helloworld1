package co.edu.statics;

public class Person {
	final String nation = "Korea";
	final String ssn;
	static final double PI = 3.14; // 한번 선언되어지면 항상 같은 값을 가지게 된다 다른 인스턴스에서도 불가 | 클래스에 소속이 되어 있고, 값을 변경도 할 수 없음
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}

