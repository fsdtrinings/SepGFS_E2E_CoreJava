package p1;

public class Employee {

	private String employeeName;
	private int id;
	private int salary;
	private Address address;
	
	
	private String department;// null
	
	
	public Employee() {
		employeeName = "Not Set";
		id = 0;
		salary = 0;
		department = "Not Set";
		
	}
	
	public Employee(int empId,String empName) {
		id = empId;
		employeeName = empName;
	}
	
	public Employee(String employeeName, int id, int salary, String department) {
		
		this.employeeName = employeeName;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	

	public Employee(String employeeName, int id, int salary, Address address, String department) {
		super();
		this.employeeName = employeeName;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
