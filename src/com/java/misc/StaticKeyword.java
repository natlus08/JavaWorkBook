package com.java.misc;

public class StaticKeyword {
	static {
		System.out.println("In static block");
	}
	public StaticKeyword(){
		System.out.println("In constructor");
	}
	{
		System.out.println("In instance block");
	}
	
	public static void main(String[] args) {
		
		StaticKeyword sk = new StaticKeyword();
		
		StaticKeyword sk1 = new StaticKeyword();

	}	
	
}

