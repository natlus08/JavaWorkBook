package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class RemoveIf {
	
	private static void printUpperCase(String number) {
		System.out.println(number.toUpperCase());
	}
	
	private void printLowerCase(String number) {
		System.out.println(number.toLowerCase());
	}
	
	private int getLength(String number) {
		return number.length();
	}

	public static void main(String[] args) {
		
		RemoveIf classInstance = new RemoveIf();
		
		List<String> numbers = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four"));
		
		/*numbers.removeIf(number -> (number.charAt(0) == 'O'));
		
		// access static methods with class name
		numbers.forEach(RemoveIf::printUpperCase);
		
		// access methods with class instance
		numbers.forEach(classInstance::printLowerCase);*/
		
		// create a function and apply
		Function<String, Integer> lengthFunc = classInstance::getLength;
		
		numbers.forEach(number -> {
			System.out.print(lengthFunc.apply(number));
		});

	}

}
