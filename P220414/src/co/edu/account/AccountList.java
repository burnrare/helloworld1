package co.edu.account;

import java.util.Scanner;

public class AccountList {

	Scanner scn = new Scanner(System.in);
	Account[] accounts = new Account[50];

	String AccountNo;
	String ActName;
	int money;

	public void execute() {
		while (true) {
			System.out.println("1. 계좌 생성 2. 계좌 목록 3. 입금 4. 출금 5. 종료");
			System.out.println("선택 >> ");
			int menu = 0;
			menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

	// 계좌 생성
	public void createAccount() {

		System.out.println("\n--------------");
		System.out.println("    계좌 생성");
		System.out.println("--------------\n");

		System.out.println("생성할 계좌 번호 : ");
		AccountNo = scn.next();
		System.out.println("계좌 주 : ");
		ActName = scn.next();
		System.out.println("예금액 : ");
		money = scn.nextInt();

		Account accList = new Account(AccountNo, ActName, money);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = accList;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}

	// 목록 조회
	public void accountList() {

		if (accounts != null) {
			System.out.println("\n--------------");
			System.out.println("   계좌 목록");
			System.out.println("--------------\n");

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] == null) {
					break;
				}
				System.out.println(accounts[i].getActName() + " | "  + accounts[i].getAccountNo() + " | "  + accounts[i].getMoney());

			}

		}
	}

	// 입금 처리
	public void deposit() {

		String AccountNo2;
		int money2;

		if (accounts != null) {

			System.out.println("\n--------------");
			System.out.println("      입금");
			System.out.println("--------------\n");

			System.out.println("계좌 번호를 입력해 주세요 :");
			AccountNo2 = scn.next();
			System.out.println("얼마를 입금하시겠습니까 : ");
			money2 = scn.nextInt();

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i].getAccountNo().equals(AccountNo2)) {
					int sum = money2 + money;
					accounts[i].setMoney(sum);
					System.out.println("예금이 성공되었습니다.");
					System.out.println(accounts[i].getActName() + " | "  + accounts[i].getAccountNo() + " | "  + accounts[i].getMoney());
					break;
				}
			}

		}
	}

	// 출금 처리
	public void withdraw() {

		String AccountNo3;
		int money3;

		if (accounts != null) {
			
			System.out.println("\n--------------");
			System.out.println("      입금");
			System.out.println("--------------\n");

			System.out.println("계좌 번호를 입력해 주세요 :");
			AccountNo3 = scn.next();
			System.out.println("얼마를 출금하시겠습니까 : ");
			money3 = scn.nextInt();

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i].getAccountNo().equals(AccountNo3)) {
					int sum = money - money3;
					accounts[i].setMoney(sum);
					System.out.println("출금이 성공되었습니다.");
					System.out.println(accounts[i].getActName() + " | " + accounts[i].getAccountNo() + " | "  + accounts[i].getMoney());
					break;
				}
			}
		}

	}

}
