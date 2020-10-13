package com.java.misc;

import java.util.Calendar;

abstract class AbstractClass {
	
	public AbstractClass(int a) {
		System.out.println("AbstractClass instantiated with - " + a);
	}
	
	abstract void getIntrestRate();
	
	void nonAbstract() {
		System.out.println("This is a non abstract method!");
	}

}

class AbstractInheritanceOne extends AbstractClass {

	public AbstractInheritanceOne(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getIntrestRate() {
		System.out.println("This is a AbstractInheritanceOne - getIntrestRate method!");
		
	}
	
}

class AbstractInheritanceTwo extends AbstractClass {

	public AbstractInheritanceTwo(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getIntrestRate() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractClassEntry {
	public static void main(String[] args) {
		AbstractClass absCla = new AbstractClass(10) {
			
			@Override
			void getIntrestRate() {
				System.out.println("From the annonymous");				
			}
			
		};
		
		absCla.getIntrestRate();
		
		absCla.nonAbstract();
		
		AbstractInheritanceOne absInhOne = new AbstractInheritanceOne(15);
		
		absInhOne.getIntrestRate();
		
		int n = 1234;
		
		System.out.println((n % 9 == 0) ? 9 : (n % 9));
	}
}
