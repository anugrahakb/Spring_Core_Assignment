package com.question;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configuration.AppConfig;
import com.model.Employee;
import com.service.EmployeeService;

public class AppMain {

	public static void main(String args[]){
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Register employee using service
		 */
		Employee employee = new Employee();
		employee.setName("Danny Theys");
		service.registerEmployee(employee);
		
		context.close();
	}
}
