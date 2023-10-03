package org.cg.firstapp.main;

import org.cg.firstapp.entity.Employee;
import org.cg.firstapp.entity.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("abc.xml");
	
		Employee e = spring.getBean("employee",Employee.class);
		System.out.println(e);
		System.out.println(e.getLaptop());
		
		
		
	}

}
