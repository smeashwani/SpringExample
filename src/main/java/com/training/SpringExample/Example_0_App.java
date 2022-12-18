package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.springcore.config.AopConfig;
import com.training.springcore.model.Address;
import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AopConfig.class);
		Employee bean = app.getBean(Employee.class);
		System.out.println(bean);
		System.out.println(bean.getName());
		
		Address add = app.getBean(Address.class);
		System.out.println(add.getCity());
	}
}

