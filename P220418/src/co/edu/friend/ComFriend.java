package co.edu.friend;

public class ComFriend extends Friend {

	private String company;
	private String department;
	
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
	
	public ComFriend() {
		super();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// this는 자기 자신. 부모클래스를 바로 상속받기 때문에 호출 가능
	// super 역시 부모클래스가 가지고 있는 getphone을 가지고 올 수 있다
	@Override
	public String toString() {
		return "ComFriend [name = " + getName() + ". phone = " + getPhone() + ". company = " + company + ", department = " + department + "]";
	}
	
}
