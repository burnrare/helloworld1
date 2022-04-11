package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
		// 표준 입출력
		// Scanner scn = new Scanner(System.in); // 키보드 
		// System.out.println("세 개의 단어를 입력해 주세요. ex) 안녕 방가 잘가");
		
//		while (scn.hasNext()) {
//			String str = scn.next(); // 사용자가 입력한 값을 문자 형식으로 리턴한다.
//			System.out.println(str);
//			if(str.equals("exit")) {
//				break;
//			}
//		}
		
		System.out.println("숫자를 입력해 주세요.");
		while(true) {
			int readByte;
			try {
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 13)
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		 System.out.println("end of program"); // 무한 while 반복 때문에 여기까지 오지 않는다
	}
}
