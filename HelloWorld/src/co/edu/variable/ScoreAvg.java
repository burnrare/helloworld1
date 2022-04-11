package co.edu.variable;

import java.util.Scanner;

public class ScoreAvg {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int s1, s2, s3, sum;
		double avg;
	
		System.out.println("점수를 입력해 주세요.");
		s1 = scn.nextInt();
		s2 = scn.nextInt();
		s3 = scn.nextInt();
		
		sum = s1 + s2 + s3;
		avg = sum / 3.0;

		System.out.printf("입력하신 점수는 %2d, %2d, %2d이고, 합계는 %3d, 평균은 %.2f입니다.", s1, s2, s3, sum, avg);
		
		
		int max = s1;
		
		if(s2 > max) {
			max = s2;
		} else if(s3 > max) {
			max = s3;
		}
		
		System.out.printf("\n입력하신 점수의 최대 점수는 %2d입니다.", max);
		
	}
}
