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
			System.out.println("2. Display All Employee ");
			System.out.println("3. Search Employee By ID ");
			System.out.println("4. Search Employee By Department ");
			System.out.println("5. Search Employee By Salary Range ");

			
			System.out.println("0. Exit");
			System.out.println("Enter Option :- ");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				app.fillEmployeeForm();
				break;
			case 2:
				app.getAllEmployees();
				break;
			
			case 3:
				app.getEmployeeBasedOnId();
				break;
			case 4:
				app.getEmployeeBasedOnDepartment();
				break;
			case 5:
				app.getEmployeeBasedOnSalaryRange();
				break;
			
			case 0:
				System.exit(0);
			}// end switch
			System.out.println("\n--------------------------------------------------------------\n");
		} // end while

	}// end main

	private void getEmployeeBasedOnSalaryRange() {
		
		System.out.println("Enter Salary R1 : - ");
		int salary1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Salary R2 : - ");
		int salary2 = Integer.parseInt(sc.nextLine());
		
		
		List<Employee> allDataFromDb = server.getEmployeeBySalaryRange(salary1, salary2);
		for (Employee employee : allDataFromDb) {
			displayEmployee(employee);
		}
	}
	
	private void getEmployeeBasedOnDepartment() {
		System.out.println("Enter Department Name to Be Searched : - ");
		String searchDepartment = sc.nextLine();
		
		List<Employee> allDataFromDb = server.getEmployeeByDepartment(searchDepartment);
		for (Employee employee : allDataFromDb) {
			displayEmployee(employee);
		}
	}
	
	
	
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

		System.out.println("Enter Id to be Searched  : - ");
		int searchid = Integer.parseInt(sc.nextLine());
		
		Employee e = server.getEmployeeById(searchid);
		
		if(e != null)	displayEmployee(e);
		else System.out.println(" Employee Not Found For ID : "+searchid);
		
		
	}
	public void getAllEmployees()
	{
		List<Employee> allSavedEmployees = server.getAllEmployees();
		
		for (Employee employee : allSavedEmployees) {
			displayEmployee(employee);
			
		}
	}

}// end class
