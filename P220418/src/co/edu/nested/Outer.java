package co.edu.nested;

public class Outer {
	public class Inner {

	}

	private String f1;

	// 중첩 클래스
	
	// 인스턴스 멤버 클래스
	static class Inner1 { // static으로 선언되면 메소드를 하나씩 만들어야 함
		String f2;

		void method2() {
			System.out.println("method2() call.");
		}
	}
		
	// 정적 멤버 클래스

	static class Inner2 {
		String f4;
		static String f5;
		
		void method4() {
			System.out.println("method4() call.");
		}
		
		static void method5() {
			System.out.println("method5() call.");
		}
	}
	
	public void method1() {
		System.out.println("method1() call.");

		// 로컬 클래스
		class Local {
			String f3;

			void method3() {
				System.out.println("method3() call.");
			}
		}
		Local local = new Local();
		local.method3(); 
	}

}
