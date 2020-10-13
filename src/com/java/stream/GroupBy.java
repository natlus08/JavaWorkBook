package com.java.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "hameedu", new BigDecimal(10000));
		Employee emp2 = new Employee(1, "sultan", new BigDecimal(20000));
		Employee emp3 = new Employee(1, "kader", new BigDecimal(10000));
		
		List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
		
		Map<BigDecimal, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
						
		result.forEach((key, value) -> {
			System.out.println(key + "--" + value.size());
		});
	}

}

class Employee {
	
	private int id;
	private String name;
	private BigDecimal salary;	
	
	public Employee(int id, String name, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
}
