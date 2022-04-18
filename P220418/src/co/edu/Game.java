package co.edu;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;

		int[] rAry = new int[5];

		for (int i = 0; i < 5; i++) {
			rAry[i] = (int) (Math.random() * 5) + 1;
			for (int j = 0; j < i; j++) {
				if (rAry[i] == rAry[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("[" + rAry[i] + "]");
		}

		while (isTrue) {

			System.out.println("\n숫자 5가 있는 공간은 몇 번째일까요.");
			int userChoice = scn.nextInt();

			for (int i = 0; i < 5; i++) {
				if (userChoice == i + 1) {
					System.out.print("[" + rAry[i] + "]");
				} else if(userChoice != i + 1) {
					System.out.print("[*]");
				}
				if (userChoice == i + 1 && rAry[i] == 5) {
					System.out.println("정답입니다.");
					isTrue = false;
					break;
				}
			}
		}
	}
}
