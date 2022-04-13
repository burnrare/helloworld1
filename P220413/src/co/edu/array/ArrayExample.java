package co.edu.array;

public class ArrayExample {
public static void main(String[] args) {
	int score1 = 80;
	
	// 여러 개의 같은 유형의 값을 저장
	int[] intAry = new int[30]; // 정수 30개를 담을 공간 생성
	
	intAry[0] = 30;
	intAry[4] = 40;
	intAry[29] = 40;
	
	System.out.println(intAry[0]);
	System.out.println(intAry[1]);
	
	double[] dblAry = new double[10]; // double 형태의 저장 공간 10개 선언
	
	String[] strAry = new String[5];
	
	System.out.println(strAry[0]);
	
	int[] otherAry = {10, 20, 30, 40};
	int[] theOtherAry = {10, 20, 30, 40};
	System.out.println(otherAry[0]);
	
	if(otherAry[0] == theOtherAry[0]) {
		System.out.println(otherAry[0] + ", " + theOtherAry[0]);
	} else {
		System.out.println("diff");
	}







	}
}
