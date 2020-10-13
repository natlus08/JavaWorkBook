package com.java.misc;

public class Final extends NotFinal {

	public static void main(String[] args) {

	}
	
	@Override
	void nonFinalMethod() {
		
	}

}


final class Finally {
	
	String nonFinalString;
	
	final String finalString = "intialized";
	
	final void finalMethod() {
		nonFinalString = "initialized in a final method";
	}
}

class NotFinal {
	
	String nonFinalString;
	
	final String finalString = "intialized";
	
	final void finalMethod() {
		
	}
	
	void nonFinalMethod() {
		
	}
}