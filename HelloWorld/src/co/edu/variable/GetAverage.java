package co.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // import -> ctrl + shift + o
		
		int num1, num2, num3;
		String myName = "황하경";
		
		System.out.println("숫자 세 가지를 입력해 주세요.");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		// 정수 연산 = 정수
		double avg;
		avg = (num1 + num2 + num3) / 3.0;
		
		
		// 결과값 : 입력한 세 정수는 10, 15, 15 이고 평균은 13.3333 입니다.
		// System.out.println("입력한 세 정수는 \n" + num1 + "\n" + num2 + "\n" + num3 + "이고, 평균은 " + avg + "입니다.");
		System.out.printf("이름은 %3s이고, 평균은 %.2f이고, 나이는 %2d입니다.\n", myName, avg, num1);
		System.out.printf("입력한 세 정수는 %2d, %2d, %2d이고, 평균은 %.2f입니다.", num1, num2, num3, avg);
	}
}
