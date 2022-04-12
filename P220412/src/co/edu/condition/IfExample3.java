package co.edu.condition;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 중첩 구문
		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C 그 외는 F
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.");
		int score = scn.nextInt();
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else {
			System.out.println("F");
		}
	}
}
