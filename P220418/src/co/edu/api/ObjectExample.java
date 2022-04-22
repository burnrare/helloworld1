package co.edu.api;

import java.util.HashSet;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return super.hashCode(); // 해쉬코드는 객체마다 가지는 독특한 값
		return this.age; // 나이가 같은 것끼리만 구분을 하겠습니다.
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // obj라는 값이 member 클래스에 인스턴스 값인지 체크
			Member member = (Member) obj;
			return member.name.equals(member.name);
		}
//		return super.equals(obj);
		return false;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	

}

public class ObjectExample {
	public static void main(String[] args) {
		
		// ArrayList 인덱스 요소를 구분 중복된 값 저장
		// Set (집합) : 요소값으로 구분 중복된 값 X
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200); // 중복된 값 저장 x라서 system.out어쩌구에서는 3개만 나온다
		
		System.out.println(set.size());
		
		//hashcode => 100, 200, 300으로 분류를 한 뒤 비교하고, 이걸 세 그룹으로 나뉘어서 진행한다.
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 22));
		members.add(new Member("김길동", 22));
		
		System.out.println(members.size()); // 중복된 값 저장
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		
		
	}
}
