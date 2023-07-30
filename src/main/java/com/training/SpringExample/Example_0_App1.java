package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee1;

/**
 * Hello world!
 *
 */
public class Example_0_App1 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory =    new ClassPathXmlApplicationContext("application1.xml"); 

		Employee1 student = (Employee1) factory.getBean("empBean");
		System.out.println(student);
    }
}
