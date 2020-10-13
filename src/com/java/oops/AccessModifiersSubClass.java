package com.java.oops;

public class AccessModifiersSubClass extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		
		am.protectedMethod();		
		am.defaultmethod();
		am.publicMethod();
		
	}

}
