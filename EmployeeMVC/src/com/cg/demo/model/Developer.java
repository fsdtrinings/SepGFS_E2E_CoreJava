package com.cg.demo.model;

import java.time.LocalDateTime;

public class Developer extends Employee{

	private String projectName;
	private int yearlyBonus;
	private int grade;
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	public Developer(String employeeName, int id, int salary, String department) {
		super(employeeName, id, salary, department);
		// TODO Auto-generated constructor stub
	}
	public Developer(String employeeName, int id, int salary, String department, String projectName, int yearlyBonus, int grade) {
		super(employeeName, id, salary, department);
		this.projectName = projectName;
		this.yearlyBonus = yearlyBonus;
		this.grade = grade;
	}
	
	
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getYearlyBonus() {
		return yearlyBonus;
	}
	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public int getSalary() {
		int actualSalary = getSalary()*12;
		if(grade==5)
		{
			actualSalary+= yearlyBonus;
		}
		else if(grade==4) {
			actualSalary = (int)(actualSalary+(yearlyBonus*0.75));
		}
		else if(grade==3) {
			actualSalary = (int)(actualSalary+(yearlyBonus*0.40));
		}
		
		return actualSalary;
	}
	
	public String attendProjectCall()
	{
		LocalDateTime now = LocalDateTime.now();
		String callInfo = "Joined Project "+projectName+" call "+now;
		return callInfo;
	}
	/*
	@Override
	public void placeFoodOrder() {
		
		System.out.println("Developer food place order ");
	}
	*/
	
	
}















