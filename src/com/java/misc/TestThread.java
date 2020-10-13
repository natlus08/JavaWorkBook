package com.java.misc;

public class TestThread {
public static void main(String[] args) {
	/*SampleDemo a = new SampleDemo("A");
	SampleDemo b = new SampleDemo("B");
	b.start();
	a.start();*/
	
	/*B b = new B();
	
	System.out.println(b instanceof C);*/
	
	try {
		System.out.println(doStuff(args));
	}
	
	catch(Exception e) {
		System.out.println("exec");
	}
	doStuff(args);
	
	
}

static int doStuff(String[] args) {
	return Integer.parseInt(args[0]);
}
}

class SampleDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	SampleDemo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(threadName);
		}
		
	}
	
	public void start(){
		if (t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}


class A extends D {

	@Override
	void testmethod() {
		// TODO Auto-generated method stub
		
	}
	
}

class B {
	
}

class C extends B {
	
}

 abstract class D {
	 public String name;
	abstract void testmethod();
	
}
 
 abstract class E {
		abstract void testmethod();
		
	}