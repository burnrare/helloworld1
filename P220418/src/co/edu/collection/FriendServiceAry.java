package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 배열 Array
public class FriendServiceAry implements FriendService {

	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	@Override
	public void insert(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

	}

	@Override
	public void update(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(friend.getName()) && friends[i] != null) {
				friends[i].setPhone(friend.getPhone());
				break;
			}
		}

	}

	@Override
	public void delete(String name) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(name) && friends[i] != null) {
				friends[i] = null;
				break;
			}
		}

	}

	@Override
	public Friend findFriend(String name) {

		for (Friend friend : friends) {
			if(friend.getName().equals(name) && friend != null) {
				System.out.println(friend.toString());
			}
		}
		return null;

	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

}
