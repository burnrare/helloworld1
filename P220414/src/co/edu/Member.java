package co.edu;

public class Member {
	// 필드 -> 회원 아이디, 회원 이름, 회원 연락처, 회원 나이

	private String userId; // 멤버 클래스 안에서만 접근 가능
	private String userNm;
	private String userNo;
	int userAge; // 마이너스 값이 들어가면 안 된다.

	// 생성자 -> source / generate ~ using

	public Member(String userId, String userNm, String userNo, int userAge) {
		super();
		this.userId = userId;
		this.userNm = userNm;
		this.userNo = userNo;
		this.userAge = userAge;
	}

	// 메소드
	
	void setMemberId(String id) {
		userId = id;
	}
	
	String getMemberID() {
		return userId;
	}
	
	// 만들어짐

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
//	--------------------------------------------
	
	
	// end

	void setMemberAge(int searchAge) {
		if(userAge < searchAge) {
			
		} else {
		userAge = searchAge;
		}
	}
	
	int getMemberAge() {
		return userAge;
	}

	void showInfo() {
		System.out.printf("회원 아이디 %3s\n회원 이름 %4s\n회원 연락처 %13s\n회원 나이 %2d\n", userId, userNm, userNo, userAge);
	}

}
