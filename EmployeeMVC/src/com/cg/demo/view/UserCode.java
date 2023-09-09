package com.cg.demo.view;

import java.util.Scanner;

import com.cg.demo.ctr.EmployeeController;
import com.cg.demo.model.Developer;
import com.cg.demo.model.Employee;
import com.cg.demo.model.Hr;


public class UserCode {

	Scanner sc = new Scanner(System.in);
	EmployeeController ctr = new EmployeeController();
	
	public static void main(String[] args) {
		UserCode app = new UserCode();
	
		while(true)
		{
		
				System.out.println(" Select Employee Type");
				System.out.println("1. Developer ");
				System.out.println("2. HR ");
				System.out.println("3. Get Employee By ID"); 
				System.out.println("4. Get Employee By Employee Type");
				System.out.println("5. Get Employee By Project Name");
				System.out.println("6. Get Employee From DB");
				System.out.println("0. EXIT");
				
				
				System.out.println("Enter Option: - ");
				int option = Integer.parseInt(app.sc.nextLine());
				
				switch (option) {
				case 1:
					app.enterEmployeeDetails("developer");
					break;
				case 2:
					app.enterEmployeeDetails("hr");
					break;
				case 6:
					app.getEmployeeDetails();
						break;
				case 0 : 
					System.exit(0);

				default:
					break;
				}
		}//end while
	
	}//end main
	public void getEmployeeDetails()
	{
		Employee e = ctr.getEmployeeFromDB();
		System.out.println(e);
	}
	public void enterEmployeeDetails(String empType)
	{
		System.out.println("Enter Employee Name : - ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee ID :- ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Salary :- ");
		int salary = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Department : - ");
		String Department = sc.nextLine();
		
		if(empType.equals("developer"))
		{
			System.out.println("Enter Employee projectName : - ");
			String projectName = sc.nextLine();
			
			System.out.println("Enter Employee yearlyBonus :- ");
			int yearlyBonus = Integer.parseInt(sc.nextLine());
			
			
			System.out.println("Enter Employee grade :- ");
			int grade = Integer.parseInt(sc.nextLine());
			
			
			Developer d = new Developer
					(name, id, salary, Department,
							projectName, yearlyBonus, grade);
			
			ctr.createEmployee(d);
			
			
		}
		
		if(empType.equals("hr"))
		{
			System.out.println("Annual Incentive :- ");
			int incentive = Integer.parseInt(sc.nextLine());
			Hr hr = new Hr(name, id, salary, Department, incentive);
		}
		
		
		
		
		
		
		
	}
	
	
}//end class
















