package org.cg.firstapp.main;

import org.cg.firstapp.entity.Employee;
import org.cg.firstapp.entity.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("abc.xml");
	
		Employee e = spring.getBean("e1",Employee.class);
		System.out.println(e);
		
		Employee e2 = spring.getBean("e2",Employee.class);
		System.out.println(e2);
		
		System.out.println("E2 Laptop :- "+e2.getLaptop().getLaptopNumber());
		
		
		System.out.println("-----------");
		Employee e3 = spring.getBean("e3",Employee.class);
		System.out.println(e3);
		for (Task t : e3.getAllIssuedTask()) {
			System.out.println(t);
		}
		
	}

}
