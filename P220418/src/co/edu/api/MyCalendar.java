package co.edu.api;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class MyCalendar {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
	
		
		String y = scn.next();
		String m = scn.next();
		showCal(y, m);

	}

	private static void showCal(String y, String m) {
		// 달력 출력
		Calendar cal = Calendar.getInstance();
		Scanner scn = new Scanner(System.in);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		year = scn.nextInt();
		month = scn.nextInt();
		day = scn.nextInt();
		
		cal.set(year, month, day);
		
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월");
		
		
		
		switch (m) {
		
		}
		
	}
}
