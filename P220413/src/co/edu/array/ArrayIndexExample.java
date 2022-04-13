package co.edu.array;

import java.util.Scanner;

public class ArrayIndexExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[3]; // 학생 이름
		int[] scores = new int[3]; // 학생 점수
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println("학생의 이름을 입력하세요.");
			names[i] = scn.nextLine();
			
			System.out.println("학생의 점수를 입력하세요.");
			scores[i] = scn.nextInt();
			scn.nextLine(); // 순서만큼 처리가 됩니다
			
		}

		System.out.println("조회할 학생의 이름을 입력해 주세요.");
		
		String searchName = scn.nextLine();
		
		for(int i = 0; i < names.length; i++) { // index를 중심적으로 사고하자
			if(names[i].equals(searchName)) {
				System.out.println("학생명 " + searchName + "\n학생 점수 " + scores[i]);
			}
		}
		
		
	}
}
