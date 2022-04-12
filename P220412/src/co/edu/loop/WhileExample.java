package co.edu.loop;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("숫자를 입력해 주세요. 종료를 위해 -1을 입력해 주세요.");
			int temp = scn.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력 값의 합은 " + sum);
		
		
	}
}
