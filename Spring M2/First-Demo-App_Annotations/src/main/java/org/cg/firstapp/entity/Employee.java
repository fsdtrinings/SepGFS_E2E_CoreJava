package org.cg.firstapp.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("101")
	private long empId;
	@Value("${name}")
	private String name;
	@Value("#{1500+1900}")
	private int annualSalary;
	@Value("${post}")
	private String designation;
	
	@Autowired
	private Laptop laptop;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long empId, String name, int annualSalary, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.annualSalary = annualSalary;
		this.designation = designation;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", annualSalary=" + annualSalary + ", designation="
				+ designation + ", laptop=" + laptop + "]";
	}
	
	
	
	
	
	
	
}
