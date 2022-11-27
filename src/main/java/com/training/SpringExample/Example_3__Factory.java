package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.DatabaseSingleton;

public class Example_3__Factory {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("factory.xml"); 
	    	DatabaseSingleton obj = (DatabaseSingleton) factory.getBean("dbSingleton");
			System.out.println(obj);
			
			ApplicationContext factory1 =    new ClassPathXmlApplicationContext("factory.xml"); 
			DatabaseSingleton obj1 = (DatabaseSingleton) factory1.getBean("dbSingleton");
			System.out.println(obj1);
		
	    }
}
