package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.EmployeeLazy;

/**
 * Hello world!
 *
 */
public class Example_2_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeLazy employee = app.getBean(EmployeeLazy.class);
		System.out.println(employee);
		System.out.println(employee.getAdddress());
		
	}
}
