package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee2;

public class Example_2_Autowire {
	  public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("autowire.xml"); 
	    	Employee2 student = (Employee2) factory.getBean("empBean");
			System.out.println(student);
	    }
}
