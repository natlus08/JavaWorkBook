package com.java.adecco;

class Static1 {
	{
		System.out.print("A");
	}
	
	static {
		System.out.print("B");
	}
}

class Static2 {
	{
		System.out.print("C");
	}
	
	static {
		System.out.print("D");
	}
}

public class StaticKeyword {
	public static void main(String[] args) {
		Static1 s1 = new Static1();
		Static2 s2 = new Static2();
	}
}
