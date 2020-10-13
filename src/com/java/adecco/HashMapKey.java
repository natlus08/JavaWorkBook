package com.java.adecco;

import java.util.HashMap;
import java.util.Map;

public class HashMapKey {
	public static void main(String[] args) {
		Map<String[], String> map = new HashMap<String[], String>();
		
		map.put(new String[] {}, "first");
		map.put(new String[] {}, "second");
		
		System.out.println(map);
	}
}
