package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
		
		int val = 2147483647; // 4 * 1byte => 1byte = 8 * bit; 값이 on/off 
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L; // long형의 값을 표현할 때는 숫자 뒤 L을 붙여야 한다
		long val3 = 10; // 10 -> long형 타입으로 변환(promotion:자동 형 변환)
		
		int val4 = (int) 10L; // long 값 -> int (casting: 강제 형 변환)타입으로 바꿉니다 
		
		int result = (int) (100L / 5); // 
		
		long val5 = 100000000000L;
		long val6 = 10L;
		
		int result2 = (int) (val5 - val6);
		
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(result);
		System.out.println(result2);
	
		char charLit = 97; // 0 ~ 65535까지의 정수값에 문자를 표현한다
		System.out.println(charLit);
		charLit = 44032;
		
		for(int i=0; i<20; i++) {
			System.out.println(charLit++);
		}
		System.out.println(charLit);
		System.out.println((int)charLit);
		
	}
}
