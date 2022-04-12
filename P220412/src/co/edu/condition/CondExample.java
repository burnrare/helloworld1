package co.edu.condition;

public class CondExample {
	public static void main(String[] args) {
		// 임의 값: Math.random();
		// 51~100까지의 임의의 값.
		int rVal = (int) (Math.random() * 50) + 51;
		System.out.println(rVal);
		rVal /= 10;
	
		switch(rVal) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		case 6:
		case 5:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			
			break;
		}
	}
}
