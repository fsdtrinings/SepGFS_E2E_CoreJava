package p1;

import java.util.Objects;

public class Laptop implements Comparable<Laptop>
{
	private int cost;
	private String brandName;
	private String modelName;
	private int ram;
	private int hdd;
	private float starRating;
	
	
	public Laptop(int cost, String brandName, String modelName, int ram, int hdd, float starRating) {
		super();
		this.cost = cost;
		this.brandName = brandName;
		this.modelName = modelName;
		this.ram = ram;
		this.hdd = hdd;
		this.starRating = starRating;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public float getStarRating() {
		return starRating;
	}
	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}
	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", brandName=" + brandName + ", modelName=" + modelName + ", ram=" + ram
				+ ", hdd=" + hdd + ", starRating=" + starRating + "]";
	}
	@Override
	public int hashCode() {
		return brandName.length()+modelName.length()+cost+hdd*3+3;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Laptop)
		{
			Laptop laptop = (Laptop)obj;
			boolean a = laptop.brandName.equals(this.getBrandName());
			boolean b = laptop.cost==this.cost;
			boolean c = laptop.hdd==this.hdd;
			boolean d = laptop.modelName.equals(this.getModelName());
			boolean e = laptop.ram==this.getRam();
			
			return a && b && c && d && e;
		}
		else
		{
			return false;
		}
		
	}
	@Override  // default
	public int compareTo(Laptop laptop) {
		
		return this.getBrandName().compareTo(laptop.getBrandName());
	}

	
	
	
}















