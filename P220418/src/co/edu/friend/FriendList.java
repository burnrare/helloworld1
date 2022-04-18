package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		
		final String val = "Hwang";
		
		
		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("황하경", "010-0000-0000", "영진대", "컴정");
//		friends[1] = new ComFriend("황현우", "010-1111-1111", "영진컴퍼니", "개발");
//		friends[2] = new Friend("황희경", "010-2222-2222");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1. 친구 등록 | 2. 친구 목록 | 3. 친구 이름으로 조회 | 4. 종료");
			System.out.println("메뉴 선택 > ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("친구 설정을 선택해 주세요 1. 학교 친구, 2. 회사 친구, 3. 일반 친구");
				int submenu = scn.nextInt();
				if (submenu == 1) {

					System.out.println("친구 이름을 입력해 주세요.");
					String name = scn.next();
					System.out.println("친구 연락처를 입력해 주세요.");
					String phone = scn.next();
					System.out.println("친구 학교명을 입력해 주세요.");
					String univ = scn.next();
					System.out.println("친구 학과를 입력해 주세요.");
					String major = scn.next();

					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new UnivFriend(name, phone, univ, major);
							break;
						}
					}

				} else if (submenu == 2) {

					System.out.println("친구 이름을 입력해 주세요.");
					String name = scn.next();
					System.out.println("친구 연락처를 입력해 주세요.");
					String phone = scn.next();
					System.out.println("친구 회사명을 입력해 주세요.");
					String company = scn.next();
					System.out.println("친구 부서를 입력해 주세요.");
					String depart = scn.next();

					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new ComFriend(name, phone, company, depart);
							break;
						}
					}

				} else if (submenu == 3) {

					System.out.println("친구 이름을 입력해 주세요.");
					String name = scn.next();
					System.out.println("친구 연락처를 입력해 주세요.");
					String phone = scn.next();

					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new Friend(name, phone);
							break;
						}
					}

				}
			} else if (menu == 2) {

				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("친구 정보\n" + friend.toString());
					}
				}

			} else if (menu == 3) {

				System.out.println("찾고자 하는 친구의 이름을 입력해 주세요.");
				String searchNm = scn.next();

				for (Friend friend : friends) {
					if (friend.getName().equals(searchNm) && friend.getName() != null) {
						System.out.println("찾은 친구명 " + searchNm + "\n" + friend.toString());
					}
				}

			} else if (menu == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}

		}

//		for (Friend friend : friends) {
//			if (friend != null) {
//				System.out.println("친구 정보 : " + friend.toString());
//			}
//		}
	}
}
