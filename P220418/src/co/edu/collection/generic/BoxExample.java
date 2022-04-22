package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange { // extends Object가 생략되어 있다
	
}
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); // 스트링 타입으로 지정하겠다
		box.setField("Orange");
		String result = box.getField(); // 반환되는 타입이 오브젝트 // 리턴 타입은 오브젝트기 때문에 형변환을 해야 한다
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>(); // 스트링 값의 list 문자열만 담을 수 있다 
		list.add("황하경");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("황하경", "010-5555-5555"));
		
//		Orange orange = box.getField(); // Orange 클래스의 결과값을 받아서 오겠다
	}
}
