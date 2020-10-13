package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.put("Z", "a");
		// sort by key
		List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());
		System.out.println("-----------------sort by key--------------------");
		sortedByKey.forEach(System.out::println);

		// loop a map
		System.out
				.println("-----------------looping a map--------------------");
		map.forEach((key, value) -> {
			System.out.println(key + '-' + value);
		});

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		// list.forEach(System.out::println);
		// sort
		System.out.println("-----------------sort a list--------------------");
		List<String> sortedList = list.stream().sorted()
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		// filter
		System.out
				.println("-----------------filter a list--------------------");
		List<String> filteredList = list.stream()
				.filter(item -> item.contains("o"))
				.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		// map
		System.out
				.println("-----------------list to uppercase--------------------");
		List<String> mappedList = list.stream().map(item -> item.toUpperCase())
				.collect(Collectors.toList());
		mappedList.forEach(System.out::println);
		// min
		System.out
				.println("-----------------get min of a list--------------------");
		System.out.println(list.stream()
				.min(Comparator.comparing(String::valueOf)).get());
		// max
		System.out
				.println("-----------------get max of a list--------------------");
		System.out.println(list.stream()
				.max(Comparator.comparing(String::valueOf)).get());
		// reduce
		System.out
				.println("-----------------reduce a list--------------------");
		System.out.println(list.stream().reduce(
				"",
				(partialString, element) -> partialString.toUpperCase() + ' '
						+ element.toUpperCase()));

		// Stream on generic types
		ITEmployee itEmployee1 = new ITEmployee("sultan", 1L, "CDB", 75000F);
		ITEmployee itEmployee2 = new ITEmployee("hameedu", 251L, "ADM", 85000F);
		ITEmployee itEmployee3 = new ITEmployee("ayaan", 120L, "INS", 175000F);
		ITEmployee itEmployee4 = new ITEmployee("jeni", 80L, "CDB", 75000F);
		ITEmployee itEmployee5 = new ITEmployee("jeni", 70L, "CDB", 85000F);

		List<ITEmployee> employees = Arrays.asList(itEmployee1, itEmployee2,
				itEmployee3, itEmployee4, itEmployee5);

		List<ITEmployee> filteredEmployees = employees
				.stream()
				.filter(employee -> {
					return employee.getDepartment().equalsIgnoreCase("CDB") ? true
							: false;
				}).collect(Collectors.toList());
		System.out.println(filteredEmployees);
		
		Comparator<ITEmployee> nameComparator = (employee1, employee2) -> {
			return employee1.getName().compareToIgnoreCase(employee2.getName());
		};
		List<ITEmployee> sortedEmployees = employees.stream()
				.sorted(Comparator.comparing(ITEmployee::getName).thenComparing(ITEmployee::getSalary))
				.collect(Collectors.toList());
		
		System.out.println(sortedEmployees);
		
	}
}

class ITEmployee {

	public ITEmployee(String name, Long id, String department, Float salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	private String name;
	private Long id;
	private String department;
	private Float salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department="
				+ department + ", salary=" + salary + "]";
	}
}
