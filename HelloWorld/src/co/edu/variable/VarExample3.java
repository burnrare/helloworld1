package co.edu.variable;

public class VarExample3 {
	public static void main(String[] args) {
		
		{
			int age = 26;	
			System.out.println("나이는 " + age);
		}
		
		int age = 30;
		System.out.println(age);
		
		// 조건문 if
		
		boolean isTrue = true;
		isTrue = false;
		isTrue = age > 20;
		
		if(isTrue) {
			System.out.println("후반 " + age);
		} else {
			System.out.println("초반 " + age);
		}
		
	}
}
