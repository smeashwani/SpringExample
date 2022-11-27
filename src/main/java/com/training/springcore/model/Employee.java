package com.training.springcore.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

abstract public class Employee {//implements InitializingBean , DisposableBean{

	private String name;
	int age;
	int salary;
	Address address;
	List<String> qualification;
	Map<Address, String> answers;

	public abstract Address applyAddress();
	
	  public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		//this.setAddress(applyAddress());
		this.address = applyAddress();
	  }
	  
	  public void destroy() throws Exception {
		System.out.println("destroy of bean");
	}
//	public void applyAddress(){
//		ApplicationContext factory = new ClassPathXmlApplicationContext("innerBean.xml"); 
//		Address obj =  factory.getBean("address1",Address.class);
//		this.address = obj;
//	}
	public Employee() {
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int age, Address address, int salary) {
		this.name = name;
		this.age=age;
		this.salary=salary;
		this.address= address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary +" Address: " +address+ getQualification()+this.answers+"]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setQualification(List qualification) {
		this.qualification = qualification;
	}
	
	public List getQualification() {
		return qualification;
	}
	
	public Map getAnswers() {
		return answers;
	}
	
	public void setAnswers(Map answers) {
		this.answers = answers;
	}
	
}
