package co.edu.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DAO DBMS = new MysqlDAO();
		while (true) {
			System.out.println("1. 입력 | 2. 수정 | 3. 삭제 | 4. 목록");
			int menu = scn.nextInt();
			if (menu == 1) {
				DBMS.insert();
			} else if (menu == 2) {
				DBMS.update();
			} else if (menu == 3) {
				DBMS.delete();
			} else if (menu == 4) {
				DBMS.list();
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
