package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1. 추가 | 2. 종료");
			System.out.print("선택 > ");

			String menu = null;

			try {
				Class.forName("java.lang.String");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} // 매개 값으로 들어와 있는 것을 인스터스로 만들겠다

			try {
				menu = Integer.parseInt(scn.nextInt());
//				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 선택하세요.");
				scn.nextInt();
			} finally {
				System.out.println("예외 처리에서 반드시 한 번은 실행");
			}

		}
		System.out.println("end of program");
	}
}
