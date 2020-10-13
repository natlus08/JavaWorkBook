/**
 * 
 */
package com.java.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author hus8623
 *
 */
public class HareTortoise {
	
	/**
	 * Input
	 * Hills	Paths
	 * 4		5
	 * Start 	End 	Tortoise	Hare
	 * 1		2		2			10
	 * 2		3		4			400
	 * 3		4		8			100
	 * 4		3		2			5
	 * 3		1		1			1000
	 * 
	 * Output
	 * Paths	Margin
	 * 2		95
	 * 3-4-3	(100+5)-(8+2)=95
	 */

	public static void main(String[] args) {
		System.out.println("Hills Paths");		   
		Scanner scan = new Scanner(System.in);
		String[] hillsPaths = scan.nextLine().split(" ");
		int hills = Integer.parseInt(hillsPaths[0]);
		int paths = Integer.parseInt(hillsPaths[1]);
		
		int[][] inputData = new int[paths][4];
		
		// Cols (m)
	    IntStream.range(0, paths).forEach( i -> {
	    	System.out.println("Start End Tortoise Hare");
	    	String[] data = scan.nextLine().split(" ");	    	
	    	// Rows (n)
	    	IntStream.range(0, 4).forEach( j -> {
	    		inputData[i][j] = Integer.parseInt(data[j]);
	    	});
	    });	
	    scan.close();
	    
	    LinkedList<RouteMap> routeMaps = Arrays.stream(inputData).map(RouteMap::new).collect(Collectors.toCollection(LinkedList::new));
	    
	    routeMaps.forEach(inst -> {
	    	int startPoint = inst.getStart();
	    	int endPoint = inst.getEnd();	    	
	    });    
	}
}

class RouteMap {
	int start;
	int end;
	int timeTakenByHare;
	int timeTakenByTortoise;
	
	public RouteMap(int[] source) {
		super();
		this.start = source[0];
		this.end = source[1];
		this.timeTakenByTortoise = source[2];
		this.timeTakenByHare = source[3];		
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getTimeTakenByHare() {
		return timeTakenByHare;
	}
	public void setTimeTakenByHare(int timeTakenByHare) {
		this.timeTakenByHare = timeTakenByHare;
	}
	public int getTimeTakenByTortoise() {
		return timeTakenByTortoise;
	}
	public void setTimeTakenByTortoise(int timeTakenByTortoise) {
		this.timeTakenByTortoise = timeTakenByTortoise;
	}
	@Override
	public String toString() {
		return "RouteMap [start=" + start + ", end=" + end
				+ ", timeTakenByHare=" + timeTakenByHare
				+ ", timeTakenByTortoise=" + timeTakenByTortoise + "]";
	}	
	
}
