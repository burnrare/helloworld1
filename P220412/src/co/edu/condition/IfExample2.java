package co.edu.condition;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = scn.nextInt();
		// 2의 배수인지 3의 배수인지 2와 3의 공톰배수인지
		
		if((num % 3 == 0) && (num % 2 == 0)) {
			System.out.println(num + "는(은) 2의 배수, 3의 배수, 공통배수입니다.");
		}	
	}
}
