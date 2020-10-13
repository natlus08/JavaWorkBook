package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Which one of the below line of code does not compute the sum of salaries?

class Associate {
	String name;
	Integer id;
	Integer salary;	
	public Associate(String name, Integer id, Integer salary) {		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}	
	public Integer getSalary() {
		return salary;
	}		
}

public class EmployeeExecution {
	public static void main(String[] args) {
		Associate employee1 = new Associate("EmployeeOne", 123456, 1000000);
		Associate employee2 = new Associate("EmployeeTwo", 123457, 1500000);
		Associate employee3 = new Associate("EmployeeThree", 123458, 1200000);
		List<Associate> employees = Arrays.asList(employee1, employee2, employee3);
		Long sumOfSalaries = employees.stream().mapToLong(employee -> employee.getSalary()).sum();
		System.out.println(sumOfSalaries);	
	}
}
