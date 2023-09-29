package edu.training.hrapp.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // use to tell hibernate that this class we want to persist/save
@Table(name = "CGEmployee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int empId;
	@Column(name="EmployeeName",nullable = false)
	private String fullname;
	@Column(nullable = false)
	private int annualSalary;
	private String designation;
	private String department;
	private LocalDate dob;
	private LocalDate doj;
	
	
	public Employee(String fullname, int annualSalary, String designation, String department, LocalDate dob,
			LocalDate doj) {
		super();
		this.fullname = fullname;
		this.annualSalary = annualSalary;
		this.designation = designation;
		this.department = department;
		this.dob = dob;
		this.doj = doj;
	}
	public Employee(String fullname, int annualSalary) {
		super();
		this.fullname = fullname;
		this.annualSalary = annualSalary;
	}
	
	
	
}
