package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.Parent;
import com.training.springcore.model.ParentLookup;

/**
 * Hello world!
 *
 */
public class Example_1_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Parent parent = app.getBean(Parent.class);
		System.out.println(parent);
		System.out.println(parent.getChild());
		System.out.println(parent.getChild());
		
		
		System.out.println("--------Lookup---------");
		ParentLookup beanPL = app.getBean(ParentLookup.class);
		System.out.println(beanPL);
		System.out.println(beanPL.getChildDetails());
		System.out.println(beanPL.getChildDetails());
		
		beanPL = app.getBean(ParentLookup.class);
		System.out.println(beanPL);
		System.out.println(beanPL.getChildDetails());
		System.out.println(beanPL.getChildDetails());
	}
}
