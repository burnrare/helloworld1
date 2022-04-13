package co.edu;

public class ReferenceExam {
	public static void main(String[] args) {
		// 기본 타입
		int num1 = 100;
		int num2 = 100;

		if (num1 == num2) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
		// 참조 타입
		String str1 = new String("황하경"); // 인스턴스
		String str2 = new String("황하경"); // 인스턴스
		str1 = null;
		str1 = "황희경";
		
		if(str1.equals(str2)) { // 참조 형태의 변수일 경우, == 대신 equals를 사용한다
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}
		
	}
}
