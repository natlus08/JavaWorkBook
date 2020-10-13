package com.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelSort {
	
	public static void main(String[] args) {
		int[] toSort = new int[] { 5, 1, 89, 255, 7, 88, 200, 123, 66 }; 
		
		//Arrays.parallelSort(numbers.toArray());
		Arrays.parallelSort(toSort);
		
		System.out.println(Arrays.toString(toSort));
	}
}