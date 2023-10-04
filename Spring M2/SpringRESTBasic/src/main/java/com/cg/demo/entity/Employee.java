package com.cg.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id;
	private String name;
	private String location;
	private int salary;
	public Employee(String name, String location, int salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	
	
}
