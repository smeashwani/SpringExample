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
//    	Resource resource = new ClassPathResource("application.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
    	ApplicationContext factory =    new ClassPathXmlApplicationContext("application.xml"); 

		Employee student = (Employee) factory.getBean("empBean");
		student.displayInfo();
		student.setName("welcome");
		
		Employee student1 = (Employee) factory.getBean("empBean");
		student1.displayInfo();
		
		Employee student2 = (Employee) factory.getBean("empBean1");
		student2.displayInfo();
	
    }
}
