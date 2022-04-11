package co.edu.variable;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int fa; 
		
		System.out.println("화씨 온도를 입력해 주세요.");
		fa = scn.nextInt();
		
		double ce = 5 / 9.0 * (fa - 32); // double은 나누기를 할 때 소수점까지 넣어 줘야 한다
		
		System.out.printf("입력하신 화씨 온도는 %3d이고, 변환한 섭씨 온도는 %.1f입니다.", fa, ce);
	}
}
