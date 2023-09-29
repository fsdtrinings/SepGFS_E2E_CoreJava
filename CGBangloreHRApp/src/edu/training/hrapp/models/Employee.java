package edu.training.hrapp.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // use to tell hibernate that this class we want to persist/save
@Table(name = "CGEmployee")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)// SingleTable , TablePerClass , JOINED
public class Employee {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private long empId;
	@Column(name="EmployeeName",nullable = false)
	private String fullname;
	@Column(nullable = false)
	private int annualSalary;
	private String designation;
	private String department;
	private LocalDate dob;
	private LocalDate doj;
	
	@Embedded
	private Verification kyc;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insuranceId")
	private Insurance insurance;
	
	/* Maintaining Bi-Directional Relationship with Project entity*/
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ProjectId")
	private Project project;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Verification getKyc() {
		return kyc;
	}
	public void setKyc(Verification kyc) {
		this.kyc = kyc;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(annualSalary, department, designation, dob, doj, empId, fullname, insurance, kyc);
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
		return annualSalary == other.annualSalary && Objects.equals(department, other.department)
				&& Objects.equals(designation, other.designation) && Objects.equals(dob, other.dob)
				&& Objects.equals(doj, other.doj) && empId == other.empId && Objects.equals(fullname, other.fullname)
				&& Objects.equals(insurance, other.insurance) && Objects.equals(kyc, other.kyc);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullname=" + fullname + ", annualSalary=" + annualSalary
				+ ", designation=" + designation + ", department=" + department + ", dob=" + dob + ", doj=" + doj
				+ ", kyc=" + kyc + ", insurance=" + insurance + "]";
	}
	
	
	
	
}
