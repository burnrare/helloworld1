package co.edu.api;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// 주민번호 -> 생년월일 남/여 구분
		// 971118-2675016 97년 11월 18일 생 여자입니다~
		// 2,4면 여자 1,3이면 남자
		Scanner scn = new Scanner(System.in);

		System.out.println("주민번호를 입력해 주세요.");
		String result = checkInfo(scn.next());

		System.out.println(result);

	}

	public static String checkInfo(String Number) {

		String year = Number.substring(0, 2);
		String month = Number.substring(2, 4);
		String day = Number.substring(4, 6);
		char gender = 0;
		int length = Number.length();
		String gen = null;

		if (Number.charAt(6) == '-') {
			gender = Number.charAt(7);
		} else {
			gender = Number.charAt(6);
		}
		
		switch (gender) {
		case '1':
		case '3':
			gen = "남자";
			break;
		case '2':
		case '4':
			gen = "여자";
			break;
		}

		// 기능 구현
		return year + "년 " + month + "월 " + day + "일생 " + gen + "입니다.";
	}
}
