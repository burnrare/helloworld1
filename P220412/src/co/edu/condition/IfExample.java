package co.edu.condition;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.");
		int score = scn.nextInt();
		// 90점보다 크면 A, 80보다 크면 B, 70보다 크면 C, 나머지는 D
		
	if(score >= 90) {
		System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
}
