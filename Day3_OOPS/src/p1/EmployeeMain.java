package p1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(1021,"Ramesh");
		Employee e3 = new Employee("Suresh",102,2000,"Sales");
		
		e1.setEmployeeName("Mike");
		
	}
}
