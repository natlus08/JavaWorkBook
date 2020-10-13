package com.java.misc;

public final class ImmutableClass {
	
	final String name; 
    final int empId; 
  
    public ImmutableClass(String name, int empId) 
    { 
        this.name = name; 
        this.empId = empId; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getEmpId() 
    { 
        return empId; 
    } 
}

class CallImmutable {
	public static void main(String[] args) {
		ImmutableClass s = new ImmutableClass("ABC", 101); 
        System.out.println(s.getName()); 
        System.out.println(s.getEmpId());
        
        // will not be able to change values on the object
        //s.empId = 15;
	}
}
