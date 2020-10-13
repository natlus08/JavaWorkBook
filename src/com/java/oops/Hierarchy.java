package com.java.oops;

public class Hierarchy {

	public static void main(String[] args) {
		Parent child = new ChildB();
	}

}

class Parent {
	public void displayParent() {
		System.out.println("I am Parent");
	}
}

class ChildA extends Parent {
	public void displayChildA() {
		System.out.println("I am Child A");
	}
}

class ChildB extends ChildA {
	public void displayChildB() {
		System.out.println("I am Child B");
	}
}
