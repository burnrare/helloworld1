package co.edu;

import java.util.Scanner;

public class Student {

	// 필드
	
	String name;
	String studNo;
	int age;
	double height;
	
	// 생성자 -> 인스턴스를 만들어 줄 때 처리할 기능을 정의.
	// 매개값이 없는 생성자를 기본 생성자.
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	
	// 생성자 이름, 학번, 나이 채워 주는 생성자 
	public Student(String nm1, String sn1, int age1) {
		name = nm1;
		studNo = sn1;
		age = age1;	
		
	}
	
	// 메소드
	
	void study() {
		System.out.println(name + "(이)가 공부를 합니다.");
	}
	
	void eat() {
		System.out.println(name + "(이)가 밥을 먹습니다.");
	}
	
	void showInfo() {
		System.out.println("이름은 " + name + " 휴대폰 번호는 " + studNo + " 나이는 " + age + " 키는 " + height + "입니다." );
	}
	
	void insert() {
		System.out.println("이름, 휴대폰 번호, 나이, 키를 입력해 주세요.");
	}
	
}
