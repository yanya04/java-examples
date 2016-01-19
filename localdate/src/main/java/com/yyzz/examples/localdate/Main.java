package com.yyzz.examples.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date = LocalDate.of(1988, 2, 21);
		System.out.println(date);
		
		date = LocalDate.of(1988, Month.FEBRUARY, 21);
		System.out.println(date);
		
		LocalTime time = LocalTime.of(23, 25, 45);
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		
		dateTime = dateTime.minusDays(365).minusDays(365);
		
		System.out.println(dateTime);
		
		dateTime= dateTime.minusHours(9999);
		System.out.println(dateTime);
		
		
		Period period = Period.ofDays(25);
		dateTime = dateTime.plus(period);
		System.out.println(dateTime);
		
		System.out.println(FormatStyle.SHORT);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH mm ss");
		
		LocalTime parsedTime = LocalTime.parse("12 14 11", df);
		System.out.println(parsedTime);
		
		short x = 1;
		int y = 1;
		int z = 2;
		x = (short) (y *z);
		
		
	}

}
