package com.cg.demo.model;
// final class cannot extends
public abstract class Employee {

	private String employeeName;
	private int id;
	private int salary;
	private String department;// null
	
	
	public Employee() {
		employeeName = "Not Set";
		id = 0;
		salary = 0;
		department = "Not Set";
		
	}
	
	public Employee(int empId,String empName) {
		id = empId;
		employeeName = empName;
	}
	
	public Employee(String employeeName, 
			int id, int salary, 
			String department) {
		
		this.employeeName = employeeName;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract int getSalary();
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + ", salary=" + salary + ", department="
				+ department + "]";
	}

	public final void placeFoodOrder()
	{
		System.out.println(" code for placing food order");
	}
	
}













