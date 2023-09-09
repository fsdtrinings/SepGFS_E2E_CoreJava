package com.cg.demo.model;

public class Hr extends Employee {

	private int incentives; // 

	public Hr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hr(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	public Hr(String employeeName, int id, int salary, String department) {
		super(employeeName, id, salary, department);
		// TODO Auto-generated constructor stub
	}

	public Hr(String employeeName, int id, int salary, String department,int incentives) {
		super(employeeName, id, salary, department);
		this.incentives = incentives;
	}

	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}

	@Override
	public int getSalary() {
		return getSalary()+incentives;
	}
	
	public void conductSession()
	{
		System.out.println("Hr conducting session");
	}
	
}




















