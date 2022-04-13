package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		// 먼저 scores에 값을 저장하는 for문 작성하기
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];

		
		for (int i = 0; i < scores.length; i++) {
			
			System.out.println("학생 점수를 입력해 주세요.");
			scores[i] = scn.nextInt();

		}
		
		// 이후에 값 비교 for문 작성하기
		int high = scores[0];
		int low = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			
			if (high < scores[i]) {
				high = scores[i];
			}

			if (low > scores[i]) {
				low = scores[i];
			}
			
		}
		System.out.println("최고점은 " + high + "이고, 최저점은 " + low + "입니다.");

		// 학생 이름, 점수
		// 학생 이름 배열, 점수 배열
		
	}
}
