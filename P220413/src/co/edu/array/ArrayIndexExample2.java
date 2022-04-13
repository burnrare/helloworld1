package co.edu.array;

import java.util.Scanner;

public class ArrayIndexExample2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("달을 입력해 주세요. 2월 ~ 6월");
		int monthNum = scn.nextInt();
		
		int inth = getLastDay(monthNum);
		int[] intAry = new int[inth];
		String[] monthAry = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int mon = getMonth(monthNum);
		int[] month = new int[mon];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}
		// 달 출력
		for (int j = 0; j < month.length; j++) {
			month[j] = j + 1;
		}

		System.out.printf("%3d월", mon);
		System.out.println();

		// 요일 출력
		for (int i = 0; i < monthAry.length; i++) {
			System.out.printf("%4s", monthAry[i]);
		}
		System.out.println();

		int spc = getDayInfo(monthNum); // 공란 만들기

		for (int i = 0; i < spc; i++) {
			System.out.printf("%4s", " ");
		}

		// 날짜 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spc) % 7 == 6) {
				System.out.println();
			}
		}

	} // end of main();
	
	public static int getMonth(int month) {

		switch (month) {
		case 2:
			return 02;
		case 3:
			return 03;
		case 4:
			return 04;
		case 5:
			return 05;
		case 6:
			return 06;
		default:
			return 0;
		}

	}

	public static int getLastDay(int month) {

		switch (month) {
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		default:
			return 0;
		}

	}

	public static int getDayInfo(int month) { // getDayInfo -> method

		switch (month) {
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5;
		case 5:
			return 0;
		case 6:
			return 3;
		default:
			return 0;
		}

	}

} // end of class;
