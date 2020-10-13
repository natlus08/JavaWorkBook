package com.java.oops;

public class ExceptionCaller {
	static void m1() throws BaseException {
		
	}
	
	static void m2() throws ChildException {
		//m1();
	}
	
	public static void main(String[] args) {
		try {
			m2();
		} catch (BaseException e) {
			e.printStackTrace();
		}
	}
	
}
