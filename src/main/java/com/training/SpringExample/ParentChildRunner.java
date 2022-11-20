package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Child;

public class ParentChildRunner {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("parent_child.xml");
	    	Child bean = factory.getBean(Child.class);
	    	System.out.println(bean);
	    }
}
