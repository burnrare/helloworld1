package co.edu;

public class OperatorExample3 {
	public static void main(String[] args) {
		// 비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 21;
		
		if(num1 == num2) {
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}
		
		if(num1 >= num2) {
			System.out.println("num1이 num2보다 큽니다.");
		} else {
			System.out.println("num1이 num2보다 작습니다.");
		}
		
		if(num1 != num2) {
			System.out.println("값이 다릅니다.");
		} else {
			System.out.println("값이 같습니다.");
		}
		
		if((++num1 % 2 == 0) && num2++ % 2 == 0) {
			System.out.println("두 수는 짝수입니다.");
		} else {
			System.out.println("두 수가 짝수는 아닙니다.");
		}
		
		System.out.println(num1 + ", " + num2);
		
		if((++num1 % 2 == 0) || num2++ % 2 == 0) {
			System.out.println("두 수 중 하나는 짝수입니다.");
		} else {
			System.out.println("두 수는 홀수입니다.");
		}
		
		System.out.println(num1 + ", " + num2);
		
		System.out.println("end of prog");
	}
}
