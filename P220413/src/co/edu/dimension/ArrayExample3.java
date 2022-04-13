package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("첫 번째 값 > ");
		num1 = scn.nextInt();
		System.out.println("두 번째 값 > ");
		num2 = scn.nextInt();
		System.out.println("세 번째 값 > ");
		num3 = scn.nextInt();

		int[] intAry = { num1, num2, num3 };

		for (int j = 0; j < intAry.length - 1; j++) { // 두 번 돌지
			for (int i = 0; i < intAry.length - 1; i++) { // 두 번 돌아
				if (intAry[i] > intAry[i + 1]) { // 1) i = 0(5) > 1(69) x -> [0]에 들어감. 2) i = 1(69) > 2(10) o. dump 값:
													// 10. 3) i = 2(10) > 3(69)
					int dump = intAry[i]; // 위치 바꾸기
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = dump;
				}
			}
			System.out.println(intAry[0] + ", " + intAry[1] + ", " + intAry[2]); // 오름차순
		}

		// 내림차순

		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry.length; i++) {
				if (intAry[i] < intAry[i + 1]) {

				}
			}
		}

	}
}
