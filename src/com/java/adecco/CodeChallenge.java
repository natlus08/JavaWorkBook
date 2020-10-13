package com.java.adecco;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CodeChallenge {
	public static void main(String[] args) {
		String input = "DC501GCCCA098911";
		String[] result = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		StringBuffer output = new StringBuffer();
		for (String substr : result) {
			char[] charArray = substr.toCharArray();
			Arrays.sort(charArray);
			output.append(charArray);
		}
		System.out.println(output.toString());
	}	
}
