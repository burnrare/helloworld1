package co.edu;

public class InheritExample {
	public static void main(String[] args) {
		Child1 c1 = new Child1(); // 생성자 호출
		
		c1.field1 = "ㅎㅇ"; // 부모 필드
		c1.field2 =  "절 아시나요"; // 자식 필드
		
		System.out.println(c1.field1); 
		System.out.println(c1.field2);
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2(); // Child2 생성자 호출
		c2.field1 = ""; // 부모 필드
		c2.field3 = ""; // 자식이 가지고 있는 것 자식 필드
		
		c2.method1();
		c2.method3();
		
		// 부모의 참조 변수에 자식의 인스턴스를 할당할 수 있다
		Parent p1 = new Parent();
		p1 = new Child1(); // int -> long, double(자동 형변환 promotion)
		p1 = new Child2(); // 자동 형 변환
		
		p1.field1 = ""; // 부모가 가지고 있는 필드와 메소드만 활용 가능
		p1.method1(); // 부모가 가지고 있는 필드와 메소드
		
		c2 = (Child2) p1; // 큰 범위를 작은 범위에 담을 때는 (강제 형 변환) 해 줘야 함 
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
		
	}
}
