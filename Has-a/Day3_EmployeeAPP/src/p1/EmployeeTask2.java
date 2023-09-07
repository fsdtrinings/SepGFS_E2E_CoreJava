package p1;

public class EmployeeTask2 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(101, "Mike");
		Address address = new Address("ABc-123","Banglore", "KA", 1521515);
// 		e.setAddress("ABC-123","Banglore","Karnataka"); // error
		e.setAddress(address);
		
		
		String state = e.getAddress().getState();
		
	}

}
