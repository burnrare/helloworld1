package co.edu.variable;

public class IfExample {
	public static void main(String[] args) {
		int myAge = 19;
		boolean over20; // 변수의 길이는 신경 쓰지 않아도 된다.
		over20 = myAge > 20; // over20 == myAge > 20
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
	}
}
