package co.edu.loop;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int random = (int) (Math.random() * 3) + 1;
		int user = 0;
		
		boolean isTrue = true;
		
		while(isTrue) {
		System.out.println("\n------------------------");
		System.out.println("1. 가위 | 2. 바위 | 3. 보");
		System.out.println("------------------------\n");
		System.out.println("\n숫자를 선택해 주세요.");
		user = scn.nextInt();
			
		if(user == random) {
			System.out.println("비겼습니다. 다시 시도해 보세요." + "\n컴퓨터 : " + random + " 당신 : " + user);
		} else if ((user == 1 && random == 2) || (user == 2 && random == 3) || (user == 3 && random == 1)) {
			System.out.println("승리했습니다. 축하합니다." + "\n컴퓨터 : " + random + " 당신 : " + user);
			isTrue = false;
		} else {
			System.out.println("패배했습니다. 다시 시도해 보세요." + "\n컴퓨터 : " + random + " 당신 : " + user);
			continue;
		}
		}
	}
}
