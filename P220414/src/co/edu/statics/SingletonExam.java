package co.edu.statics;

class Car {
	
}


public class SingletonExam {
	public static void main(String[] args) {
//		Singleton s1 = new <- 이렇게 만들 수 없다 왜냐면 private
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if (s1 == s2) {
			System.out.println("같다"); // 결과값 똑같은 주소값을 참조하고 있다
 		} else {
			System.out.println("다르다");
		}
	}
}
