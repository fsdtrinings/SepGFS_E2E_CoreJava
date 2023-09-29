package edu.training.hrapp.models;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CGInsurance")

public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long insuranceId;
	private String name;
	private int sumAssured;
	
	
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(String name, int sumAssured) {
		super();
		this.name = name;
		this.sumAssured = sumAssured;
	}

	public long getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(long insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}

	@Override
	public int hashCode() {
		return Objects.hash(insuranceId, name, sumAssured);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Insurance other = (Insurance) obj;
		return insuranceId == other.insuranceId && Objects.equals(name, other.name) && sumAssured == other.sumAssured;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", name=" + name + ", sumAssured=" + sumAssured + "]";
	}
	
	
	
}












