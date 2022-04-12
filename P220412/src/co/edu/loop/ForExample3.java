package co.edu.loop;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 1~100 반복
		// 최초로 sum의 값이 1000보다 큰 값이 되면 break;
		int sum = 0;
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(sum >= 1000) {
				break;
			}
			sum += i;
			cnt += 1;
		}
		System.out.println(sum + ", 순번 " + cnt);		
	
		System.out.println("----------------------------");
		// 1~10 반복 / sum = sum*1;
		
		sum = 1;
		for(int i=1; i<=10; i++) {
			sum *= i;
		}
		System.out.println(sum);
		
		System.out.println("----------------------------");
		
		// 입력한 숫자의 약수를 구하는 프로그램
		
		Scanner scn = new Scanner(System.in);
		int dia = scn.nextInt();
		int cnt2 = 0;
		
		for(int i=1; i<=dia; i++) {
			if(dia % i == 0) {
				cnt2++;
			}
		}
		System.out.println(cnt2);
		

	}
}
