package com.training.springcore.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee6 implements InitializingBean , DisposableBean{

	private String name;
	int age;
	int salary;
	Address address;
	
	//InitializingBean method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee6.afterPropertiesSet()");
	}
	
	//DisposableBean method
	@Override
	public void destroy() throws Exception {
		System.out.println("Employee6.destroy()");
	}
	
	
	private void xmlInitMethod() {
		System.out.println("Employee6.xmlInitMethod()");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("Employee6.xmlDestroyMethod()");
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
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}