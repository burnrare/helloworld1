package co.edu.variable;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("첫 번째 정수를 입력하세요.");
		num1 = scn.nextInt(); // 사용자가 입력한 값을 일고 int형으로 변환.
		
		System.out.print("두 번째 정수를 입력하세요.");
		num2 = scn.nextInt(); // 사용자가 입력한 값을 일고 int형으로 변환.
		
		System.out.println("입력값은 " + num1+ "입니다.");
		System.out.println("입력값은 " + num2 + "입니다.");
		
		// 큰 수에서 작은 수를 뺀 결과값을 나오도록
		
		int n1, n2;
		
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		n1 = scn.nextInt();
		System.out.println("두 번째 숫자를 입력해 주세요.");
		n2 = scn.nextInt();
		
		if (n1 > n2) {
			int result1 = n1 - n2;
			System.out.println("입력한 값들의 뺄셈의 값은 : " + result1);
		} else {
			int result2 = n2 - n1;
			System.out.println("입력한 값들의 뺄셈의 값은 : " + result2);
		}
		
	}
}
