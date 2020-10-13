package com.java.misc;

import com.java.oops.AccessModifiers;

public class AccessModifiersSubClassDifferentPackage extends AccessModifiers {

	public static void main(String[] args) {
		AccessModifiersSubClassDifferentPackage am = new AccessModifiersSubClassDifferentPackage();
		am.protectedMethod();		
		//am.defaultmethod();
		am.publicMethod();
	}
}