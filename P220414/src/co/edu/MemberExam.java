package co.edu;

import java.util.Scanner;

import co.edu.Student;

public class MemberExam {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "사용자1", "010-2343-4534", 23);
		m1.setMemberAge(-25);
		m1.setMemberId("user05");
//		System.out.println("나이 " + m1.getMemberAge());
//		System.out.println("아이디 " + m1.getMemberID());
//		m1.showInfo();

		Member[] members = new Member[3];
		Scanner scn = new Scanner(System.in);

		String id, name, phone;

		for (int i = 0; i < members.length; i++) {
			System.out.println("회원 아이디, 이름, 연락처, 나이를 입력해 주세요.");
			id = scn.next(); // 스페이스를 기준으로 앞의 값을 가지고 온다.
			name = scn.next();
			phone = scn.next();
			int age = Integer.parseInt(scn.next());

			Member newMember = new Member(id, name, phone, age); // 새로운 인스턴스
			members[i] = newMember;
		}

		for (Member member : members) {
			member.showInfo();
		}
//		1. 조회(이름) 2. 변경(아이디, 연락처): 입력한 아이디 값의 연락처를 변경 3. 조회(입력했던 나이보다 큰 회원만 조회) 4. 종료 
		while (true) {
			System.out.println("\n-------------------------------------------");
			System.out.println("1. 조회(이름) | 2. 변경 | 3. 조회(나이) | 4. 종료");
			System.out.println("-------------------------------------------\n");

			int menu = scn.nextInt(); // Integer.parseInt(scn.nextLine());
			scn.nextLine(); // 메뉴와 엔트키까지 처리

			if (menu == 1) {
				System.out.print("회원 이름을 입력해 주세요 > ");
				String searchNm = scn.next();
				for (Member member : members) {
					if (member.getUserNm().equals(searchNm)) {
						member.showInfo();
					}
				}

			} else if (menu == 2) {
				System.out.println("변경할 회원 아이디를 입력해 주세요.");
				String searchid = scn.next();
				System.out.println("변경할 번호를 입력해 주세요.");
				String userNo2 = scn.next();

				for (Member member : members) {
					if (member.getUserId().equals(searchid)) {
						member.setUserNo(userNo2);
						member.showInfo();
					}
				}

			} else if (menu == 3) {
				System.out.println("비교할 나이를 입력해 주세요.");
				int searchAge = scn.nextInt();
				for (Member member : members) {
					if (member.getUserAge() > searchAge) {
						member.showInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			} else {
				for (Member member : members) {
					member.showInfo();
				}
			}
		}

	}
}
