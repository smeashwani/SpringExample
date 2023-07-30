package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee;

public class Example_2_Autowire {
	  public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("autowire.xml"); 
			Employee student = (Employee) factory.getBean("empBean");
			System.out.println(student);
	    }
}
