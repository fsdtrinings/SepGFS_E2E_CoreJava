package p3;

public class Employee {

	private int salary;
	private String gender;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int salary, String gender) {
		super();
		this.salary = salary;
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
