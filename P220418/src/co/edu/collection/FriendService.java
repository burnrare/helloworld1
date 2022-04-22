package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int WOMENSEARCH = 5;
	public int MENSEARCH = 6;
	
	public void insert(Friend friend); // 매개 값
	public void update(Friend friend);
	public void delete(String name);
	public Friend findFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);
	
}	
