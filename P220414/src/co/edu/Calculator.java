package co.edu;

public class Calculator {
	private double pi = 3.14;

	// 리턴 타입 없는 것, 리턴 타입이 있는 것

	void printPT() {
		System.out.println("원주율은 " + pi);// 리턴 타입이 없다
	}

	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름은 " + radius + "\n넓이는 " + area);
	}

	// 리턴 타입이 있다
	// method의 오버 로딩 -> 동일한 이름의 메소드

	int sum(int num1, int num2) {
		System.out.println(num1 + num2);
		return num1 + num2;
	}

	double sum(double n1, double n2) {
		return n1 + n2;
	}

	// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산해 주는 메소드를 만들어 보세요 getTriangleArea
	double getTriangleArea(double s1, double h1) {
		return s1 * h1 / 2;
	}

	// 매개변수 클래스 배열
	int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}

	// 평균을 계산.
	double avg(int[] intAry) {
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
			cnt++;
		}
		double avg = sum / cnt;
		return avg;
	}

	double average(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3;
	}

	double average(int... args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return (double) (sum / args.length);
	}

}
