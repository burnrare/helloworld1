package co.edu;

public class BitOperatorExample {
	public static void main(String[] args) {
		int num = 8;
		int result = num << 2; // 비트연산. 2진수로 오른쪽으로 두 번 shift
		int result2 = num >> 2; // 비트연산.
		
		System.out.println(result + ", " + result2);
	}
}
