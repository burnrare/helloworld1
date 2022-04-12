package co.edu.loop;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += 3;
		} // i = 1 : sum = 3
		  // i = 2 : sum = 6
		  // i = 3 : sum = 9
 		System.out.println(sum);
 		
 		System.out.println("구구단을 입력해 주세요.");
 		Scanner scn = new Scanner(System.in);
 		int goo = scn.nextInt();
 		
 		for(int i=1; i<=9; i++) {
 			int sum1 = goo * i;
 			System.out.println(goo + " * " + i + " = " + sum1);
 		}
 		
 		System.out.println("-----------------------------------");
 		
 		for(int i=9; i >=1; i--) {
 			int sum1 = goo * i;
 			System.out.println(goo + " * " + i + " = " + sum1);
 		}
 		
 		System.out.println("-----------------------------------");
 		
 		for(int i=0; i<4; i++) { // 열 세로
 			for(int j=0; j<3; j++) { // 행 가로 별 추가
 				System.out.print("*");
 			}
 			System.out.println("*"); // 열마다 띄어쓰기
 		}
 		
 		System.out.println("-----------------------------------");
 		
 		for(int i=0; i<5; i++) {
 			for(int j=1; j<i; j++) {
 				System.out.print("*");
 			}
 			System.out.println("");
 		}
 		
 		System.out.println("-----------------------------------");
 		
 		sum = 0;
 		for(int i=0; i<=5; i++) {
 			sum += i;
 		}
 		System.out.println("sum => " + sum);
 		
 		System.out.println("-----------------------------------");
 		
 		sum = 0;
 		for(int i=1; i<=9; i+=2) {
 			sum += i;
 			System.out.println("sum => " + sum + ", " + i);
 		}
		
		System.out.println("-----------------------------------");
 		
 		sum = 0;
 		for(int i=2; i<=10; i+=2) {
 			sum += i;
 			System.out.println("sum => " + sum + ", " + i);
 		}
 		
		System.out.println("-----------------------------------");
 		
 		sum = 0;
 		for(int i=1; i<=10; i++) {
 			if(i % 2 == 0) {
 			sum += i;
 			System.out.println("sum => " + sum + ", " + i);
 			}
 		}
 		
	}
}
