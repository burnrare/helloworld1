package co.edu.array;

public class ForExample {
	public static void main(String[] args) {
		
		int[] Fdice = new int[6];
		int[] Sdice = new int[6];
		int dice1 = 0, dice2 = 0;
		int sum = 0;

		// 주사위 게임
		// 주사위 2 개를 돌립니다.
		// 2 개의 주사위를 던져서 숫자의 합이 6이 되는 모든 경우의 수
		// 1, 5 = 6 | 2, 4 = 6 | 3, 3 = 6 등등 두 개의 숫자를 출력하는 프로그램
		// 1 ~ 6 | 1 ~ 6
		// 집에서 다시

		for (int i = 0; i < Fdice.length; i++) {
			Fdice[i] = (int) (Math.random() * 6) + 1;
			dice1 = Sdice[i];
			for (int j = 0; j < Sdice.length; j++) {
				Sdice[j] = (int) (Math.random() * 6) + 1;
				dice2 = Sdice[j];
				if(dice1 + dice2 == 6) {
					System.out.printf("(%d, %d)", dice1, dice2);
				}
			}
		}
	}
}
