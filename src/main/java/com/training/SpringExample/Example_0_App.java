package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.Employee;
import com.training.springcore.model.Parent;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		//ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee bean = app.getBean(Employee.class);
		System.out.println(bean.getAdddress());
//
//		Employee bean1 = app.getBean(Employee.class);
//		System.out.println(bean1);
//		app.registerShutdownHook();
//		
//		bean = app.getBean(Parent.class);
//		System.out.println(bean);
//		System.out.println(bean.getChildDetails());
//		System.out.println(bean.getChildDetails());
//		
//		bean = app.getBean(Parent.class);
//		System.out.println(bean);
//		System.out.println(bean.getChildDetails());
//		System.out.println(bean.getChildDetails());
	}
}
