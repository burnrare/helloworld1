package co.edu.loop;

public class ForExample2 {
	public static void main(String[] args) {
		// 1~100 반복
		// 31번째가 되면 종료.
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i == 31) {
			System.out.println("31번째입니다. 종료하시겠습니까?");
			break; // 반복문을 빠져나온다.
			}
			if(i % 2 == 0) {
				System.out.println("현재 i의 값은 " + i);
				continue;
			} else if(i % 2 == 1) {
				sum += i;
				System.out.println("sum ==> " + sum + ", " + i);
			}
		}
		System.out.println("sum => " + sum);
	}
}
