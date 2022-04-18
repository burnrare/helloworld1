package co.edu.account;

import co.edu.Board;

public class Account {
	
	private String AccountNo;
	private String ActName;
	private int money;
	
	
	// 생성자
	
	public Account(String AccountNo, String ActName, int money) {
		super();
		this.AccountNo = AccountNo;
		this.ActName = ActName;
		this.money = money;
	}

	
	// getter, setter
	
	public String getActName() {
		return ActName;
	}
	
	public void setActName(String actName) {
		ActName = actName;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	
	
}
