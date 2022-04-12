package co.edu.loop;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rVal = (int) (Math.random() * 6) + 1;
		int uVal = 0;
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("예상하고 있는 주사위 번호를 입력해 주세요.");
			uVal = scn.nextInt();
			if(uVal > rVal) {
				System.out.println("입력한 숫자보다 작습니다.");
			} else if(uVal < rVal) {
				System.out.println("입력한 숫자보다 큽니다.");
			} else {
				System.out.println("정답입니다. 입력한 주사위 값은 " + uVal + ", 컴퓨터의 주사위 값은 " + rVal + "입니다.");
				isTrue = false;
			}
		}
	}
}
