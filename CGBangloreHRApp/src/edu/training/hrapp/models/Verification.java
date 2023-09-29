package edu.training.hrapp.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
public class Verification {

	@Column(nullable = false,unique = true)
	private String adharNumber;
	@Column(nullable = false,unique = true)
	private String panNumber;
	@Column(unique = true)
	private String passport;
	private boolean status;
	public Verification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Verification(String adharNumber, String panNumber, String passport, boolean status) {
		super();
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.passport = passport;
		this.status = status;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adharNumber, panNumber, passport, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Verification other = (Verification) obj;
		return Objects.equals(adharNumber, other.adharNumber) && Objects.equals(panNumber, other.panNumber)
				&& Objects.equals(passport, other.passport) && status == other.status;
	}
	@Override
	public String toString() {
		return "Verification [adharNumber=" + adharNumber + ", panNumber=" + panNumber + ", passport=" + passport
				+ ", status=" + status + "]";
	}
	
	
}
