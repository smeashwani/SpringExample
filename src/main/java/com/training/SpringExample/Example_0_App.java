package com.training.SpringExample;

import java.util.Arrays;

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
    	//Employee emp = new Employee(22,"Guest",Arrays.asList("BTech","MTech"));
    	Employee emp = new Employee(21,"Guest",80_000);
    	edao.saveEmployee(emp);
    	System.out.println("save successfully");
    	
    	emp = new Employee(22,"Guest",70_000);
    	edao.updateEmployee(emp);
    	
    	
    	
	
	
    }
}
