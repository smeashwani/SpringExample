package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.DatabaseSingleton;
import com.training.springcore.model.Employee;

public class Example_6_beanLifeCycle {
	 public static void main( String[] args )
	    {
		 ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanLifecycle.xml"); 
	    	Employee obj =  factory.getBean("empA",Employee.class);
	    	
			System.out.println(obj);
			obj.getAddress().setCity("CITY");
			System.out.println(obj);
			
			Employee obj1 =  factory.getBean(Employee.class);
			obj.setAddress(obj1.applyAddress());
			System.out.println(obj1);
			obj1.getAddress().setCity("CITY1");
			System.out.println(obj1);
			
			factory.registerShutdownHook();
			
	    }
}
