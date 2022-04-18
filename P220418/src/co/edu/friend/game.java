package co.edu.friend;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {

		int[] rAry = new int[5];
		int cnt = 0;
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;

		for (int i = 0; i < rAry.length; i++) {
			rAry[i] = (int) (Math.random() * 5) + 1;
			for (int j = 0; j < i; j++) {
				if (rAry[i] == rAry[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < rAry.length; i++) {
			System.out.print(rAry[i] + " ");
		}

		System.out.println("몇 번째 자리에 5가 있을까요?");
		int find = scn.nextInt();

		while (true) {
			for (int i = 0; i < rAry.length; i++) {
				System.out.print("[#]");
				if (rAry[i] == find) {
					System.out.println("정답입니다. 위치: " + rAry.length);
					break;
				} else if (rAry.length != find) {
					System.out.println("다시 시도해 주세요.");
					break;
				}
			}
		}
	}
}
