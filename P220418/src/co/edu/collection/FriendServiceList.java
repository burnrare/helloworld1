package co.edu.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 컬렉션 ArrayList
public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void insert(Friend friend) {

		for (int i = 0; i < friends.size(); i++) {
			if (friends == null) {
				friends.add(friend);
			}
		}

	}

	@Override
	public void update(Friend friend) {

		for (int i = 0; i < friends.size(); i++) {
			Friend findfriend = (Friend) friends.get(i);
			if (findfriend.getName().equals(friend.getName())) {
				findfriend.setPhone(friend.getPhone());
				break;
			}
		}

	}

	@Override
	public void delete(String name) {

		for (int i = 0; i < friends.size(); i++) {
			Friend findfriend = (Friend) friends.get(i);
			if (findfriend.getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	@Override
	public Friend findFriend(String name) {

		for (int i = 0; i < friends.size(); i++) {
			Friend findfriend = (Friend) friends.get(i);
			if (findfriend.getName().equals(name) && findfriend != null) {
				return findfriend;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();

		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getGender() == gender) {
				// 열거형 타입도 클래스 타입과 같은 참조 타입
				// 기본 타입 == 비교연산자
				// 열거형 == 비교연산자
				list.add(friends.get(i)); // friend의 인스턴스 값들이 들어옴
			}
		}
		return list;
	}

}
