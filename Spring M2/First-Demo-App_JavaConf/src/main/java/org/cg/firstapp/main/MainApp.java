package org.cg.firstapp.main;

import org.cg.firstapp.entity.Employee;
import org.cg.firstapp.entity.Task;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContext =
				 new AnnotationConfigApplicationContext(MyConfigurationClass.class);
		
		Employee e = springContext.getBean("employee",Employee.class);
		System.out.println(e);
		System.out.println(e.getLaptop());
		
		
		
	}

}
