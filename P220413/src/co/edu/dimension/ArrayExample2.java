package co.edu.dimension;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 학급 1 ~ 3반
		// 1반에는 3명 / 점수 , 2반에는 4명 / 점수 , 3반에는 2명 / 점수

		int[][] scores = { { 59, 63, 72 }, { 56, 77, 33, 24 }, { 55, 76 } };

		double avg = 0;

		for (int i = 0; i < scores.length; i++) {
			int sum = 0; // sum을 세 번 초기화해야 하기 때문
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
		avg = sum / scores[i].length;
		System.out.println(sum + ", " + avg);
		}
		
		

	}
}
