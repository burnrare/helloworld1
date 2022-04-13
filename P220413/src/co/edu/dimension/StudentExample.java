package co.edu.dimension;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		// 학생이름, 점수 -> names, scores

		Student s1 = new Student(); // 학생 이름, 점수
		s1.studName = "황하경";
		s1.score = 80;
		s1.age = 12;

		Student s2 = new Student();
		s2.studName = "황희경";
		s2.score = 100;
		s2.age = 17;

		Student s3 = new Student();
		s3.studName = "황자경";
		s3.score = 73;
		s3.age = 43;
		
		Student[] students = { s1, s2, s3 };

		Scanner scn = new Scanner(System.in);
//		System.out.println("학생 이름을 입력해 주세요.");
//		String searchName = scn.nextLine();
		System.out.println("학생 나이를 입력해 주세요.");
		int searchAge = scn.nextInt(); // 23

//		for (int i = 0; i < students.length; i++) {
//			if(students[i].studName.equals(searchName)) {
//				System.out.println(students[i].score);
//			}
//		}
		
		for (int i =0; i<students.length; i++) {
			if(students[i].age > searchAge) {
				System.out.println(students[i].studName);
			}
		}
		
		System.out.println("end of prog");
		
		
		
		
		
		
	}
}
