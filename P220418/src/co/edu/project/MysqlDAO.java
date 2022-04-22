package co.edu.project;

import java.util.Scanner;

public class MysqlDAO implements DAO {
	
	Scanner scn = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("MySQL DB로 입력 처리합니다.");
		
	}

	@Override
	public void update() {
		System.out.println("MySQL DB로 수정 처리합니다.");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB로 삭제 처리합니다.");
	}

	@Override
	public void list() {
		System.out.println("MySQL DB로 리스트를 처리합니다.");
	}
	
}
