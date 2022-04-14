package co.edu;

import java.util.Scanner;

public class StudExample {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.name = "황하경";
		stud1.studNo = "010-5187-1104";
		stud1.age = 26;
		stud1.height = 157.9;

		Student stud2 = new Student();
		stud2.name = "황미경";
		stud2.studNo = "010-5555-1111";
		stud2.age = 28;
		stud2.height = 168.9;
		
		Student stud3 = new Student("황하경", "22-876456");
		stud1.study();
		stud2.study();
		
		Student stud4 = new Student("황미경", "010-5187-1104", 25);
		
		Scanner scn = new Scanner(System.in);
		
		stud4.showInfo();
		

	}
}
