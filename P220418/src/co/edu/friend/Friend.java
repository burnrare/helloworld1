package co.edu.friend;

// 친구의 주소록을 관리하는 프로그램
// 친구의 주소록 : 이름, 연락처
// 학교 친구 : 학교명, 전공 과목
// 회사 친구 : 회사명, 부서 
public class Friend {
	// field
	private String name;
	private String phone;
	private Gender gender; // 오직 MEN이거나 WOMEN만 올 수 있다

	// 생성자
	protected Friend() {
		super();
	}

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Friend [name = " + name + ", phone = " + phone + ", gender = " + gender + "]";
	}

}
