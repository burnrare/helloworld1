package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		// 영어 80, 수학 70 영어 > 수학
		
		int Eng = 80;
		int Mat = 70;
		
		boolean isAvg = Eng > Mat;
		
		if (isAvg) {
			System.out.println("영어 점수가 수학 점수보다 큽니다." + "\n영어 점수 = " + Eng + "\n수학 점수 = " + Mat);
		}
	}
}
