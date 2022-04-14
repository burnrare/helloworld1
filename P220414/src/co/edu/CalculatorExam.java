package co.edu;

import java.util.Scanner;

public class CalculatorExam {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.printPT();
		c1.getArea(2.4);

		int result = c1.sum(9, 5);
		System.out.println(result + "!!!");

		double result1 = c1.sum(23.4, 30);
		System.out.println(result1 + "!!!");

		Calculator c3 = new Calculator();
		int[] intAry = { 10, 20, 30, 40 };
		int result3 = c3.sum(intAry);
		System.out.println("배열의 합 : " + result3 + "!!!!!!");

		Calculator c4 = new Calculator();
		double result4 = c4.avg(intAry);
		System.out.println("배열의 평균 : " + result4 + "!!!!!!!!!!!");
		
		Calculator c5 = new Calculator();
		double result5 = c5.average(10, 20, 25);
		System.out.println("세 가지 수의 : " + result5 + "!!!!!!!!!!!");
		
		Calculator c6 = new Calculator();
		double result6 = c6.average(intAry);
		System.out.println("args의 평균 : " + result6 + "!!!!!!!!!!!!!!!");

		Scanner scn = new Scanner(System.in);
		System.out.println("삼각형의 밑변과 높이를 입력해 주세요.");
		int s1 = Integer.parseInt(scn.next());
		int h1 = Integer.parseInt(scn.next());

		Calculator c2 = new Calculator();
		double result2 = c2.getTriangleArea(s1, h1);
		System.out.println(result2 + "!!!!!!");
		
		
//		--------------------------------------------------------
		
		

	}
}
