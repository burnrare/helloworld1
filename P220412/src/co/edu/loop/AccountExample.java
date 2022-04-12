package co.edu.loop;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int insert = 0;
		int out = 0;
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("\n----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("----------------------------------\n");

			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("예금할 금액을 입력해 주세요 : ");
				insert = scn.nextInt();
				System.out.print("예금액 > " + insert + "\n");
				System.out.println("정상적으로 처리되었습니다.");
				continue;
			} else if (menu == 2) {
				System.out.print("출금할 금액을 입력해 주세요 : ");
				out = scn.nextInt();
				if (insert == 0) {
					System.out.println("출금할 수 있는 금액이 없습니다.");
					continue;
				} else {
					System.out.print("출금액 > " + out + "\n");
					System.out.println("정상적으로 처리되었습니다.");
				}
				continue;
			} else if (menu == 3) {
				if(insert != 0) {
				System.out.print("고객님의 잔고는 " + (insert - out) + " 원입니다.\n");
				} else {
					System.out.print("고객님의 잔고는 0 원입니다." + "\n");
				}
				continue;
			} else if (menu == 4) {
				isTrue = false;
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}
