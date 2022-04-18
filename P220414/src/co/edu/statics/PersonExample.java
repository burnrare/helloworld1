package co.edu.statics;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("12345-12345", "ㅎㅎㄱ");
		
		p1.name = "황하경";
//		p1.ssn = "456-789"; // p1.ssn = "456-789"는 에러가 난다 이유: final을 사용하여 ssn를 입력했기 때문이고 먼저 입력된 사항이 있어서
		
		Person p2 = new Person("123456789-123456", "황하경"); // 각각 하나의 인스턴스에만 ssn을 입력 가능
	}
}
