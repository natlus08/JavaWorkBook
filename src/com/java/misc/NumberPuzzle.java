package com.java.misc;

public class NumberPuzzle {
	public static void main(String[] args) {
		int number = 0;
		while (number < 20000) {
			if (number % 2 == 1 && number % 3 == 1 && number % 4 == 1
					&& number % 5 == 1 && number % 6 == 1 && number % 7 == 0) {
				System.out.println(number);
				break;
			}
			number++;
		}
	}
}
