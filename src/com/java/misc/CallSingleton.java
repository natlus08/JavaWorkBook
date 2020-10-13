package com.java.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

final class SingletonClass {

	private static SingletonClass singletonClass = null;

	private SingletonClass() {
		System.out.println("Singleton Instantiated");
	}

	public static SingletonClass getInstance() {
		if (Objects.isNull(singletonClass)) {
			singletonClass = new SingletonClass();
		}
		
		return singletonClass;
	}
	
}

public class CallSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Custom singleton class
		SingletonClass sClass1 = SingletonClass.getInstance();
		SingletonClass sClass2 = SingletonClass.getInstance();
		SingletonClass sClass3 = SingletonClass.getInstance();
		
	}
}
