package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		//ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee bean = app.getBean(Employee.class);
		System.out.println(bean);
		System.out.println(bean.getAdddress());
		
		System.out.println("----------");
		/*
		 * Address addBean1 = app.getBean(Address.class); Address addBean2 =
		 * app.getBean(Address.class); System.out.println(addBean1);
		 * System.out.println(addBean2);
		 */
//
//		Employee bean1 = app.getBean(Employee.class);
//		System.out.println(bean1);
		//((AbstractApplicationContext)app).registerShutdownHook();
//		
	}
}
