package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	private int age;
	private String firstName;
	private String lastName;
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

	public Student(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}

public class Comparator {
	public static void main(String[] args) {
		Student student1 = new Student(10, "Sachin", "Tendulkar");
		Student student2 = new Student(7, "MS", "Dhoni");
		Student student3 = new Student(18, "Virat", "Kohli");
		Student student4 = new Student(10, "Lionel", "Messi");
		Student student5 = new Student(7, "Christiano", "Ronaldo");
		
		List<Student> students = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5));
		
		students.forEach(student -> {
			System.out.println(student.toString());
		});
		
		students.sort(java.util.Comparator.comparingInt(Student::getAge)
				.thenComparing(java.util.Comparator.nullsLast(java.util.Comparator.comparing(Student::getFirstName)))
				.thenComparing(java.util.Comparator.nullsLast(java.util.Comparator.comparing(Student::getLastName))));
		
		System.out.println("List is sorted");
		
		students.forEach(student -> {
			System.out.println(student.toString());
		});
	}
}
