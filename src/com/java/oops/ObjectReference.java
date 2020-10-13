package com.java.oops;

public class ObjectReference {

	public static void main(String[] args) {
		Master master = new Master();
		master.getQualification();		
		
		Student student = new Student();
		student.getQualification();
		
		Master masterAsStudent = new Student();
		masterAsStudent.getQualification();
		
		Student studentAsMaster = (Student) new Master(); //Runtime exception - ClassCastException
		studentAsMaster.getQualification();
		
	}

}

/**
 * super class
 * @author hus8623
 *
 */
class Master {

	/*public Master() {
		System.out.println("I am master");
	}*/
	
	void getQualification() {
		System.out.println("Expert");
	}
	
}

class Student extends Master {

	/*public Student() {
		System.out.println("I am student");
	}*/
	
	@Override
	void getQualification() {
		System.out.println("Novice");
	} 
	
}
