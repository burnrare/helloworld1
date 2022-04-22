package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

// 배열 vs 컬렉션
// 배열 활용한 프로그램, 컬렉션을 활용한 프로그램
// 인터페이스 선언 => 구현하는 클래스
public class ArrayExample {
	public static void main(String[] args) {
		// 배열은 크기 변경이 불가
		// 컬렉션은 배열과 다르게 크기 변경에 유동적
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("황하경", "010-5187-1104");
		friendAry[1] = new Friend("김하경", "010-5000-1104");
		// friendAry[10] = new Friend("황황황", "010-0000-0000");

		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] != null) {
				// System.out.println(friendAry[i].toString());
			}
		}

		// 컬렉션을 활용, 인터페이스 활용 List: 컬렉션 => ArrayList
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("황하경", "010-1111-1111"));
		friendList.add(new Friend("김하경", "010-0000-0000"));
		friendList.remove(0);
		// 수정은 set 또는 get
		
		friendList.get(0); // object 타입으로 return된다.
		Friend f2 = (Friend) friendList.get(0); // get(index) => Object

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("친구 이름을 입력하세요");
			String name = scn.next();
			System.out.println("친구 연락처를 입력하세요");
			String phone = scn.next();

			friendList.add(new Friend(name, phone));

			for (int i = 0; i < friendList.size(); i++) {
				System.out.println(friendList.get(i));
			}
		}
		

	}
}
