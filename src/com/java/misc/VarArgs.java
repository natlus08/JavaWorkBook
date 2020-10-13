package com.java.misc;

public class VarArgs {
	
	static int sumOfNumbers(int... numbers) { //line 1
		int sum = 0;
		for(int number : numbers){
	        sum+=number;
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		int sum = sumOfNumbers(1,2,3,4,5);
		System.out.println(sum);
	}
}
