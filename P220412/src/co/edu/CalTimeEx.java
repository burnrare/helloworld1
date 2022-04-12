package co.edu;

import java.util.Scanner;

public class CalTimeEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("초를 입력해 주세요.");
		int time = scn.nextInt();
		
		// 시, 분, 초 => 5000 /  5000/(60*60) = 몇 시간
		// 나머지로 분 계산 => 5000%(60*60) = 1400/60 => 몇 분
		// 나머지는 초 계산 => ?초
		
		int hours, minutes, secs;
		
		hours = time/3600;
		time = time%36000;
		
		minutes = time/60;
		time = time%60;
		
		secs = time;
		
		System.out.printf("%3d시 %3d분 %3d초", hours, minutes, secs);

		
	}
}
