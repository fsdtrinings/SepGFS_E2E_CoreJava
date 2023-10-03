package org.cg.firstapp.main;

import org.cg.firstapp.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.cg.firstapp")
public class MyConfigurationClass {

	@Bean
	public Employee getEmployee()
	{
		return new Employee(777, "New Mike",1000,"Developer");
	}
}
