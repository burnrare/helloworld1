package co.edu.variable;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("물건 가격을 입력해 주세요.");
		int price = scn.nextInt(); // 물건 가격
		System.out.println("낼 현금을 입력해 주세요.");
		int money = scn.nextInt(); // 현금
		int tax = (int) (price * 11.0 / 100.0);
		
		System.out.println(tax);
		
	}
}
