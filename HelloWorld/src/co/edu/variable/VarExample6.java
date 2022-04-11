package co.edu.variable;

public class VarExample6 {
	public static void main(String[] args) {
		String myName = "황하경"; // 참조 데이터 타입.
		int age = 30; // 기본 데이터 타입.
		double height = 157.8;
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		
		System.out.println(myName + "의 나이는 " + age + "이고, 키는 " + height + "이고 " + "영어, 수학 점수의 합은 " + (mathScore + engScore));
		char firstChar = myName.charAt(0);
		
		System.out.println(myName.charAt(0));
		System.out.println(firstChar);
		System.out.println((int)firstChar);
		
	}
}
