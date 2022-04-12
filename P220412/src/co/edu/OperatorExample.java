package co.edu;

public class OperatorExample {
	public static void main(String[] args) {
		// 증감 연산자
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + 2; // num1의 값을 읽고 결과값을 대입
		num1 = num1 + 2; // num1의 값을 읽고 결과값을 대입
		System.out.println(num1);
		
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		
		System.out.println(num1);
		System.out.println(num1++);
		System.out.println(num1);
		
		System.out.println(++num1); // +1을 출력처리
		
		int result = num1++ + ++num2; // 19 + 21
		System.out.println(result + ", num1: " + num1 + ", num2: " + num2);
		
		byte num3 = 10; // 정수 타입 byte, int, long, short // byte < short < int < long
		num3 = (byte) (num3 + 1); // 정수 연산은 int 타입으로 처리하기 때문에 앞에 변환을 해 주어야 한다.
		
		num3 += 1;
		num3++;
		
		num3 = -125;
		num3--; // 126
		num3--; // 127
		num3--; //	??
		num3--; //  ??
		num3--; //  ??
		System.out.println(num3);
	}
}
