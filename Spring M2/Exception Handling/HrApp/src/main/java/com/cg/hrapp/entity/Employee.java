package com.cg.hrapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // used by JPA+Spring+JSON(Faster XML)
@Table(name = "MyEmployee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String empName;
	private int salary;
	private String designation;
	private String location;
	
	
	@Embedded
	@Column(nullable = true)
	private Verification empVerification;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PolicyIssued")
	private Insurance insurance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectid")
	private Project project;
	
}














