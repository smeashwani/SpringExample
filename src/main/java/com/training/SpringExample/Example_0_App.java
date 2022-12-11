package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.Parent;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Parent bean = app.getBean(Parent.class);
		System.out.println(bean);
		System.out.println(bean.getChildDetails());
		System.out.println(bean.getChildDetails());
		
		bean = app.getBean(Parent.class);
		System.out.println(bean);
		System.out.println(bean.getChildDetails());
		System.out.println(bean.getChildDetails());
	}
}
