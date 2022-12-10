package com.training.springcore.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Employee {
	private int id =101;
	private String name="Guest";
	private int salary = 10_000;
	
	@Autowired(required = false)
	@Lazy
	private Address adddress;
	
	
	@PostConstruct
	public void turnOn() {
		System.out.println("Load operating system");
	}

	@PreDestroy
	public void turnOff() {
		System.out.println("Close all programs");
	}
	
	public Employee() {
		System.out.println("Employee.Employee()");
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAdddress() {
		return adddress;
	}
	
	
	public void setAdddress(Address adddress) {
		this.adddress = adddress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adddress=" + adddress + "]";
	}
	
}
