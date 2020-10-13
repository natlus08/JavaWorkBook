package com.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTime {
	public static void main(String[] args) {
		LocalDate futureDate = LocalDate.now().plusDays(5);
		LocalDate today = LocalDate.now();
		int diffIndays = Period.between(today, futureDate).getDays();
		System.out.println(diffIndays);
	}
}
