package co.edu.condition;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("피자의 종류를 입력해 주세요.");
		String result = scn.nextLine();
		String result2;
		int price = 0;
	
		switch(result) {
			case "불고기":
				price = 15000;
				break;
			case "하와이안":
				price = 20500;
				break;
			case "페퍼로니":
				price = 18000;
				break;
			case "포테이토":
				price = 13000;
				break;
			default :
				price = 0;
				if(result == result) {
					System.out.println("주문하신 피자의 값은 " + price + "원이고, 주문하신 피자는 " + result + "입니다.");
				} else {
					System.out.println("입력하신 피자는 존재하지 않습니다.");
					}
		}

	} 
}
