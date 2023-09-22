package p1;

public class Employee {
	
	private int empId;
	private String empName;
	private long mobileNumber;
	private int salary;
	private String location;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, long mobileNumber, int salary, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
		this.location = location;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNumber=" + mobileNumber + ", salary="
				+ salary + ", location=" + location + "]";
	}
	
	
	

}
