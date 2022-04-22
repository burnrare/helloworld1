package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.set(1997, 0, 1);
		System.out.println("년도 : " + today.get(Calendar.YEAR));

		//////////////////////

		Date todate = new Date();
		System.out.println(todate.toString());
		todate = new Date("1997/11/18");
		todate.setTime(10);
		System.out.println(todate.toString());

		LocalDate ldate = LocalDate.of(1997, 11, 18);
		System.out.println(ldate.toString());

		LocalTime ltime = LocalTime.of(07, 30, 20);
		System.out.println(ltime.toString());
		
		LocalDateTime ldt = LocalDateTime.now();



	}
}
