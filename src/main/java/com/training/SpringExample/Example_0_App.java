package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.AppConfig;
import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee bean = app.getBean(Employee.class);
		System.out.println(bean);

	}
}
