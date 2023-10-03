package org.cg.firstapp.entity;

import java.util.Objects;

public class Laptop {

	
	private String laptopNumber;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String laptopNumber) {
		super();
		this.laptopNumber = laptopNumber;
	}

	public String getLaptopNumber() {
		return laptopNumber;
	}

	public void setLaptopNumber(String laptopNumber) {
		this.laptopNumber = laptopNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(laptopNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(laptopNumber, other.laptopNumber);
	}

	@Override
	public String toString() {
		return "Laptop [laptopNumber=" + laptopNumber + "]";
	}
	
	
}
