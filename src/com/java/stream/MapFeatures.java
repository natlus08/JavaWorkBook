package com.java.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class MapFeatures {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Mango", "Tropical");
		map.put("Banana", "Berry");
		map.put("Orange", "Citrus");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//map.entrySet().stream().sorted().forEach(System.out.println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out.println);
		
		
		//sortedByKey.forEach(System.out::println);
		
		// loop a map
		/*map.forEach((key, value) -> {
			System.out.println(key + '-' + value);
		});	*/			        
	}
}
