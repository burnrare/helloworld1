package co.edu.nested;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.collection.FriendService;
import co.edu.friend.Gender;

class Friend {
	String name;
	String phone;
	int age;

	public Friend(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

}

// 중첩 클래스도 만들고~ 중첩 인터페이스도 만들겠다~
public class NestedApp {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	// 중첩 인터페이스
	interface FriendService {

		int ADD = 1;
		int MOD = 2;
		int LIST = 3;

		void add();

		void modify();

		void list();
	}

	// 중첩 클래스 1
	static class FriendApp implements FriendService {

		@Override
		public void add() {

			System.out.println("친구 이름을 입력하세요.");
			String name = scn.next();
			System.out.println("친구 번호를 입력하세요");
			String phone = scn.next();
			System.out.println("친구 나이를 입력하세요");
			int age = scn.nextInt();

			// 생성자가 없으면 Friend friend = new Friend(); friend.set~~
			// new Friend(name, phone, age);

			// 배열의 비어 있는 위치에 저장
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = new Friend(name, phone, age);
					break;
				}
			}

		}

		@Override
		public void modify() {
			
			System.out.println("찾는 친구 이름을 입력하세요.");
			String name = scn.next();
			System.out.println("수정할 친구 번호를 입력하세요");
			String phone = scn.next();
			System.out.println("수정할 친구 나이를 입력하세요");
			int age = scn.nextInt();

			for (int i = 0; i < friends.length; i++) {
				if(friends[i].getName().equals(name) && friends[i] != null) {
					friends[i].setAge(age);
					friends[i].setPhone(phone);
					break;
				}
			}

		}

		@Override
		public void list() {
			// 배열에 저장되어 있는 값을 출력

			for (Friend friend : friends) {
				if (friend != null) {
					System.out.println(friend.toString());
				}

			}
		}

	}

	public static void main(String[] args) {
		
		FriendApp app = new FriendApp(); // static을 붙이지 않으면 정적 타입이라 가지고 올 수 없음이다

		while (true) {

			System.out.println("1. 추가 | 2. 수정 | 3. 조회");
			int menu = scn.nextInt();

			if (menu == FriendService.ADD) {
				app.add();
			} else if (menu == FriendService.MOD) {
				app.modify();
			} else if (menu == FriendService.LIST) {
				app.list();
			} else {
				System.out.println("end of program");
				break;
			}

		}
	}

}
