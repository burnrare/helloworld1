package co.edu.condition;

public class IfExample4 {
	public static void main(String[] args) {
		// 임의의 값을 만들어 주는 Math.random()
		
		double rVal = (int) (Math.random() * 100) + 1; // 반환해 주는 값이 double 타입(실수) 0 <= 값 < 1
		System.out.println(rVal);
	
		// 생성된 값이 1 ~ 50까지의 범위인지, 51 ~ 60까지의 범위인지, 61 ~ 70, 71 ~ 80, 81 ~ 90, 91 ~ 100
		// System.out.println("생성된 값은 61 ~ 70까지의 범위에 속하는 값입니다.");
		
		if(1 <= rVal && rVal < 50) {
			System.out.println("생성된 값은 1 ~ 50까지의 범위에 속하는 값입니다.");
		} else if(51 <= rVal && rVal <= 60) {
			System.out.println("생성된 값은 51 ~ 60까지의 범위에 속하는 값입니다.");
		} else if(61 <= rVal && rVal <= 70) {
			System.out.println("생성된 값은 61 ~ 70까지의 범위에 속하는 값입니다.");
		} else if(71 <= rVal && rVal <= 80) {
			System.out.println("생성된 값은 71 ~ 80까지의 범위에 속하는 값입니다.");
		} else if(81 <= rVal && rVal <= 90) {
			System.out.println("생성된 값은 81 ~ 90까지의 범위에 속하는 값입니다.");
		} else {
			System.out.println("생성된 값은 91 ~ 100까지의 범위에 속하는 값입니다.");
		}
	}
}
