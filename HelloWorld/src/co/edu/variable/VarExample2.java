package co.edu.variable;

public class VarExample2 {
	public static void main(String[] arg) {
		
		int KorScore = 80;
		int engScore = 70;
		int mathScore = 63;
		double avg = (KorScore + engScore + mathScore) / 3;
		
		KorScore = 85;
		engScore = 75;
		mathScore = 60;
		
		avg = (KorScore + engScore + mathScore) / 3;
		
		System.out.println("제 국어 점수는 " + KorScore);
		System.out.println("제 영어 점수는 " + engScore);
		System.out.println("제 수학 점수는 " + mathScore);
		System.out.println("평균 = " + avg);
		
	}
}
