package co.edu.loop;

import java.util.Scanner;

public class NestedExample {
	public static void main(String[] args) {
		// 구구단
		
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println("-----------");
		}
	 	
	 	// star
	 	
		for (int i = 1; i <= 5; i++) { // 열 세로
			for (int j = 1; j <= i; j++) { // 행 가로
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------");
		
		// rec
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	 	
	}
}
