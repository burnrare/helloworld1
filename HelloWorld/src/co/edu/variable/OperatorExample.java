package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		int result = 6 / 4;
		int result2 = 6 % 4;
		int val = 5;
		
		if(val % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		// 75300 원.
		// 5만 원 => ? 개, 1만 원 => ? 개, 5천 원 => ? 개
		// 1천 원 => ? 개, 5백 원 => ? 개, 1백 원 => ? 개
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("금액을 입력해 주세요.");
		int money = scn.nextInt();	
		int result3;
		
		if(money != 0) {
		
		int pa1 = 0;
		int pa2 = 0;
		int pa3 = 0;
		int pa4 = 0;
		int pa5 = 0;
		int pa6 = 0;
			
		if(money >= 50000) {
			result3 = money % 50000;
			pa1 = money / 50000; 
			money = result3;
		}
			
		if(money >= 10000) {
			result3 = money % 10000;
			pa2 = money / 10000;
			money = result3;
		}
				
		if(money >= 5000) {
			result3 = money % 5000;
			pa3 = money / 5000;
			money = result3;
		}
				
		if(money >= 1000) {
			result3 = money % 1000;
			pa4 = money / 1000;
			money = result3;
		}
		
		if(money >= 500) {
			result3 = money % 500;
			pa5 = money / 500;
			money = result3;
		}
		
		if(money >= 100) {
			result3 = money % 100;
			pa6 = money / 100;
		}
		
		System.out.printf("5만원권은 %d장, 1만원권은 %d장, 5천원권은 %d장, 1천원권은 %d장, 5백원권은 %d장, 1백원권은 %d장입니다.", pa1, pa2, pa3, pa4, pa5, pa6);
		
		}
	}
}
