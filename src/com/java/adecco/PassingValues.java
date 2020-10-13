package com.java.adecco;

class Employee {
	private Integer id;
	public Employee(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}

public class PassingValues {
	public static void main(String[] args) {
		Employee emp1 = new Employee(15);
		changeValue(emp1);
		System.out.println(emp1.getId());
	}
	
	static void changeValue(Employee emp) {
		emp.setId(20);;
	}
}
