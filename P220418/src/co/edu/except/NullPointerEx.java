package co.edu.except;

public class NullPointerEx {
	public static void main(String[] args) {
		String str = "hello";
		str = null;
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("null 값을 참조");
		}
		
		System.out.println("end of program");
	}
}
