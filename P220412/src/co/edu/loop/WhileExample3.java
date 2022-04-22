package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {                                                                                   
		// Math.random()의 생성 범위 1 ~ 10까지
		// 사용자 입력값을 담은 변수 rVal
		// while 구문으로 입력값과 Math 값이 같도록 // 크다 ~ 작다
		
		Scanner scn = new Scanner(System.in);
		int rVal = (int) (Math.random() * 10 + 1);
		int sVal = 0;
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("숫자를 1~10 중에서 하나 입력해 주세요.");
			int uVal = scn.nextInt();
			if(uVal > rVal) {
				System.out.println("입력한 숫자가 더 큽니다.");
				continue;
			} else if(uVal < rVal) {
				System.out.println("입력한 숫자가 더 작습니다.");
				continue;
			} else {
				System.out.println("정답입니다.");
				System.out.println(uVal + ", " + rVal);
				isTrue = false;
				break;
			}
		}
	}
}
