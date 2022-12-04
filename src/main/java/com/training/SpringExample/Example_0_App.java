package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Example_0_App {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
	}
}
