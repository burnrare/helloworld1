package co.edu.variable;

public class VarExample {
	public static void main(String[] arg) {
		// 변수의 선언
		int age = 20; // 오른쪽의 값을 왼쪽 변수에 할당
		double height = 157.8; // 소수점
		String myName = "황하경";
		
		age = 26;
		
		System.out.print("이름은 " + myName);
		System.out.print(" 제 키는 " + height);
		System.out.println(" 제 나이는 " + age);
		
		// 영어 점수 : 85; engScore라는 변수에 할당.
		
		int engScore = 85;
		int mathScore = 90;
		
		int result = engScore + mathScore;
		
		engScore = 80;
		mathScore = 100;
		result = engScore + mathScore;
		
		System.out.println("영어 점수 = " + engScore);
		System.out.print("수학 점수 = " + mathScore);
		System.out.println(" 의 합은 " + result);
		
	}
}
