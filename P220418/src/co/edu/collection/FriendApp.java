package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구 목록을 저장하기 위한 프로그램
// 친구 추가, 친구 수정, 친구 삭제, 친구 조회
// 1. 배열, 2. 컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		FriendService service = new FriendServiceAry(); // 배열
		FriendService service = new FriendServiceList(); // 컬렉션
		// 추가, 수정, 삭제, 조회 => 컨트롤

		while (true) {

			System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 조회 | 5. 여자 | 6. 남자");
			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if (menu == FriendService.ADD) {

				System.out.println("친구 이름을 입력해 주세요.");
				String name = scn.next();
				System.out.println("친구 연락처를 입력해 주세요.");
				String phone = scn.next();
				System.out.println("친구의 성별을 입력해 주세요. ex) 남자 / 여자");
				String gender = scn.next();

				Gender gen = Gender.MEN;

				if (gender.startsWith("남")) { // startsWith 어떤 값으로 시작합니다~ 메소드
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}

				Friend friend = new Friend(name, phone, gen);

				service.insert(friend);

				System.out.println(friend.toString());

			} else if (menu == FriendService.MOD) {

				System.out.println("수정하고 싶은 친구의 이름을 입력해 주세요.");
				String searchNm = scn.next();
				System.out.println("수정할 연락처를 입력하세요.");
				String updatePh = scn.next();

				Friend friend = new Friend(searchNm, updatePh);

				service.update(friend);

			} else if (menu == FriendService.DEL) {

				System.out.println("삭제하고 싶은 친구의 이름을 입력해 주세요.");
				String searchNm = scn.next();

				service.delete(searchNm);

			} else if (menu == FriendService.SEARCH) {

				System.out.println("조회하고 싶은 친구의 이름을 입력하세요.");
				String searchNm = scn.next();

				Friend friend = service.findFriend(searchNm);
				System.out.println(friend.toString());

			} else if (menu == FriendService.WOMENSEARCH) {
				
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
				
			} else if (menu == FriendService.MENSEARCH) {
				
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
