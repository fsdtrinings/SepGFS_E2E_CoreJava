package edu.training.hrapp.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee{

	private int contractDays;
	private String techName;
	public ContractualEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractualEmployee(String fullname, int annualSalary, String designation, String department, LocalDate dob,
			LocalDate doj) {
		super(fullname, annualSalary, designation, department, dob, doj);
		// TODO Auto-generated constructor stub
	}
	public ContractualEmployee(String fullname, int annualSalary) {
		super(fullname, annualSalary);
		// TODO Auto-generated constructor stub
	}
	public ContractualEmployee(int contractDays, String techName) {
		super();
		this.contractDays = contractDays;
		this.techName = techName;
	}
	public int getContractDays() {
		return contractDays;
	}
	public void setContractDays(int contractDays) {
		this.contractDays = contractDays;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contractDays, techName);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractualEmployee other = (ContractualEmployee) obj;
		return contractDays == other.contractDays && Objects.equals(techName, other.techName);
	}
	@Override
	public String toString() {
		return "ContractualEmployee [contractDays=" + contractDays + ", techName=" + techName + "]";
	}
	
	
	
}
