package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();

		System.out.println("학생 이름, 점수, 나이를 입력해 주세요."); // 황하경 80 20
//		s1.studName = scn.next();
//		s1.score = Integer.parseInt(scn.next()); // 1 != "1"
//		s1.age = Integer.parseInt(scn.next());

		Student[] students = {new Student(), new Student(), new Student()}; // 비어 있는 공간을 세 개 만들겠습니다.
		
		for(int i = 0; i < students.length; i++) {
			students[i].studName = scn.next();
			students[i].score = Integer.parseInt(scn.next());
			students[i].age = Integer.parseInt(scn.next());
		}
		
		if(students[i].studName.equals(students[i].studName)) {
			System.out.println(students[i].studName + ", " + students[i].score + ", " + students[i].age);
		}
		
		// 조회하고 싶은 이름을 입력
		// 해당되는 이름을 가지고 와서 홍길동은 ~ 나이는 20살이고 점수는 80점입니다
		
	}
}
