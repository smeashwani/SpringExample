package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory =    new ClassPathXmlApplicationContext("application.xml"); 

		Employee student = (Employee) factory.getBean("empBean");
		student.setName("welcome");
		System.out.println(student);
		
		Employee student1 = (Employee) factory.getBean("empBean1");
		System.out.println(student1);
	
    }
}
