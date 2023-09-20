package p3;

public class Employee {

	private String employeeName;
	private int id;
	private int salary;
	private String department;

	public Employee() {
		employeeName = "Not Set";
		id = 0;
		salary = 0;
		department = "Not Set";

	}

	public Employee(int empId, String empName) {
		id = empId;
		employeeName = empName;
	}

	public Employee(String employeeName, int id, int salary, String department) {

		this.employeeName = employeeName;
		this.id = id;
		this.salary = salary;
		this.department = department;
	}

	public int getSalary() {
		return salary;
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

	

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public final void placeFoodOrder() {
		System.out.println(" code for placing food order");
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + ", salary=" + salary + ", department="
				+ department + "]";
	}

	@Override
	public int hashCode() {
		return employeeName.length()+8+salary/2+13;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			
			boolean b1 = (this.id == e.getId());
			boolean b2 = (this.salary == e.getSalary());
			boolean b3 = (this.employeeName.equals(e.getEmployeeName()));
			boolean b4 = (this.department.equals(e.getDepartment()));
			
			return b1&& b2&& b3 && b4;
		}
		return false;
	}

	

}
