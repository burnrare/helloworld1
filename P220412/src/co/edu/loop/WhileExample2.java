package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		System.out.println("숫자를 입력해 주세요.");
		int num = scn.nextInt();
		int sum = 0;
		int cnt = 0;
		// 200이 넘게 되면 반복문을 빠져 나오게 한다.
		while(isTrue) {
				sum += num;
				cnt++;
				if(sum >= 200) {
					isTrue = false;
					break;
				}
		}
		System.out.println(sum + ", " + cnt);
		
		
		
		
		
	}
}
