package org.cg.firstapp.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {


	private long empId;
	private String name;
	private int annualSalary;
	private String designation;
	
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
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		System.out.println("Setter of Id called");
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
	@Override
	public int hashCode() {
		return Objects.hash(annualSalary, designation, empId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return annualSalary == other.annualSalary && Objects.equals(designation, other.designation)
				&& empId == other.empId && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", annualSalary=" + annualSalary + ", designation="
				+ designation + "]";
	}
	
	
	
	
}
