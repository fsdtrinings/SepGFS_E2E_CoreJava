package edu.abc.hrpro.ui;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import edu.abc.hrpro.model.Employee;
import edu.abc.hrpro.service.EmployeeServer;

public class HrApp {

	Scanner sc = new Scanner(System.in);
	EmployeeServer server ;

	public HrApp() {
		server = new EmployeeServer();// id address of Server
	}
	public static void main(String[] args) {

		HrApp app = new HrApp();
		while (true) {
			System.out.println(" ----- OPERATIONS ----");// <a>
			System.out.println("1. Add Employee ");
			System.out.println("2. Search Employee By ID ");
			System.out.println("3. Display All Employee ");
			System.out.println("0. Exit");
			System.out.println("Enter Option :- ");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				app.fillEmployeeForm();
				break;
			case 2:
				app.getEmployeeBasedOnId();
				break;
			case 3:
				app.getAllEmployees();
				break;
			case 0:
				System.exit(0);
			}// end switch
			System.out.println("\n--------------------------------------------------------------\n");
		} // end while

	}// end main

	public void fillEmployeeForm() {
		System.out.println("Enter Employee Name : - ");
		String name = sc.nextLine();
		
		System.out.println("Enter Department : - ");
		String department = sc.nextLine();
		
		System.out.println("Enter Salary : - ");
		int salary = Integer.parseInt(sc.nextLine());
		
		int id = new Random().nextInt(1000);
		
		
		Employee e = new Employee(name, id, salary, department);
		String notification = server.insertEmployee(e);
		System.out.println("Notification :- "+notification);
		

	}

	public void displayEmployee(Employee e) {
		System.out.println(e.getId()+" "+e.getEmployeeName()+" "+e.getSalary()+" "+e.getDepartment());
		System.out.println("\n");
	}

	public void getEmployeeBasedOnId() {

	}
	public void getAllEmployees()
	{
		List<Employee> allSavedEmployees = server.getAllEmployees();
		
		for (Employee employee : allSavedEmployees) {
			displayEmployee(employee);
			
		}
	}

}// end class
