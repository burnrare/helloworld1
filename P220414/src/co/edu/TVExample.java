package co.edu;

public class TVExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		Television tv = new Television();
		tv.company = "LG";
		tv.color = "Black";
		tv.price = 30000;
		tv.model = "StandByMe";
		tv.turnOn();
		tv.changeChannel(10);
		tv.turnOff();
		
		Television tv1 = new Television();
		tv.company = "LG";
		tv.color = "Black";
		tv.price = 30000;
		tv.model = "StandByMe";
		  
		System.out.println(tv);
		System.out.println(tv1);
		System.out.println(tv == tv1); // false -> 주소값이 다르기 때문이다
	}
}
