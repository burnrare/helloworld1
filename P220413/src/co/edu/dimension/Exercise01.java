package co.edu.dimension;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		boolean isTrue = true;
		int studentNum = 0;
		int scores[] = null;
		Scanner scn = new Scanner(System.in);

		while (isTrue) {
			System.out.println("\n------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------\n");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(scores == null) {
				if(selectNo == 2 || selectNo == 3 || selectNo == 4 ) {
					System.out.println("학생 수를 입력해야 실행됩니다.");
					continue;
				}
			}

			if (selectNo == 1) { // 학생 수 입력

				System.out.println("학생 수를 입력해 주세요.");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				
			} else if (selectNo == 2) { // 점수 입력

				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수를 입력해 주세요.");
					System.out.print(i + 1 + " > ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) { // 점수 리스트

				System.out.println("점수 내역 >");
				
				for (int i = 0; i < scores.length; i++) {
					System.out.print("[학생 " + (i+1) + "]" + scores[i] + "\n");
				}

			} else if (selectNo == 4) { // 분석

				int max = 0, sum = 0, cnt = 0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
					cnt++;
				}
				
				double avg = sum / cnt;
				
				System.out.printf("최고 점수: %2d\n평균 점수: %.2f", max, avg);

			} else if (selectNo == 5) { // 종료
				isTrue = false;
			}
		}

		System.out.println("프로그램을 종료합니다.");

	}
}
