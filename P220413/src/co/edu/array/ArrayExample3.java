package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] intAry = { 78, 83, 88, 92, 63 };
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int cnt = 0;

		// 각 배열의 요소의 합,
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}

		// 1, 3, 5의 합 index 0 2 4
		for (int i = 0; i < intAry.length; i++) {
			if (i % 2 == 0) {
				sum2 += intAry[i];
			}
		}

		// 가지고 온 값이 짝수인 것들만
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				sum3 += intAry[i];
				cnt++;
			}
		}

		System.out.println("합: " + sum);
		System.out.println("인덱스 0 2 4 들의 합: " + sum2);
		System.out.println("가지고 온 값이 짝수 합: " + sum3);

		// double avg 평균

		double avg = sum / intAry.length;
		double avg2 = sum2 / 3;
		double avg3 = sum3 / cnt;

		System.out.println("평균1: " + avg);
		System.out.println("평균2: " + avg2);
		System.out.println("평균3: " + avg3);

	}
}
