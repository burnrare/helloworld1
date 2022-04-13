package co.edu.array;

public class ArrayExample4 {
	public static void main(String[] args) {
		
		int[] ranAry = new int[5];
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < ranAry.length; i++) {
			ranAry[i] = (int) (Math.random() * 30) + 1;
			if (ranAry[i] > 15) {
				sum += ranAry[i];
				cnt++;
			}
			System.out.println(ranAry[i]);
		}

		double avg = sum / cnt;

		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);

	}
}
