package p1;

public class Address {

	private String houseNumber;
	private String city;
	private String state;
	private long pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String houseNumber, String city, String state, long pincode) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
