package com.training.SpringExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Employee student = (Employee) factory.getBean("empBean");
		student.displayInfo();
		student.setName("welcome");
		
		
		Employee student1 = (Employee) factory.getBean("empBean");
		student1.displayInfo();
	
    }
}
