package com.training.SpringExample;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee;
import com.training.springcore.repo.EmployeeDao;

/**
 * Hello world!
 *
 */
public class Example_0_App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
    	EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
    	
    	List<Employee> allEmployees = edao.getAllEmployees();
    	allEmployees.stream().forEach(System.out::println);
    }
}
