package co.edu.api;

public class WrapperExample {
	public static void main(String[] args) {
		// 랩퍼 클래스
		// 기본 데이터 -> 참조 데이터
		// int, long, byte -> Integer, Long, Byte

		int n1 = 100;
		Integer n2 = new Integer(200); // 선이 그이면 이러헥 스지 마라~
		n1 = n2;
		byte b1 = n2.byteValue();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(b1);
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("100");
	}
}
