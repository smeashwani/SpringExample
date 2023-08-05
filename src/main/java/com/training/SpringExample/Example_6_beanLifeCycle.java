package com.training.SpringExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee6;

public class Example_6_beanLifeCycle {
	 public static void main( String[] args )
	    {
		 	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanLifecycle.xml"); 
	    	Employee6 obj =  factory.getBean("empA",Employee6.class);
			System.out.println(obj);
			
			Employee6 obj1 =  factory.getBean(Employee6.class);
			System.out.println(obj1);
			
			factory.registerShutdownHook();
	    }
}
