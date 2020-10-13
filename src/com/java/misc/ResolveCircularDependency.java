package com.java.misc;

class CircularDependency1 {
	
	private CircularDependency2 cd2;

	public void setCd2(CircularDependency2 cd2) {
		this.cd2 = cd2;
	}
	
}


class CircularDependency2 {
	
	private CircularDependency1 cd1;

	public void setCd1(CircularDependency1 cd1) {
		this.cd1 = cd1;
	}
	
}

public class ResolveCircularDependency {
	
	public static void main(String[] args) {
		
		CircularDependency1 cd1 = new CircularDependency1();
		
		CircularDependency2 cd2 = new CircularDependency2();
		
		cd1.setCd2(cd2);
		
		cd2.setCd1(cd1);
	}
	
}