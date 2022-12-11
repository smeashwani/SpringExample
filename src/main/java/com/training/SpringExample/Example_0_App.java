package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig;
import com.training.springcore.model.UserService;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = app.getBean(UserService.class);
		bean.getDatabaseDetails();
	}
}
