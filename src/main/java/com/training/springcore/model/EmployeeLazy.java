package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeLazy {
	private int id =101;
	private String name="Guest";
	private int salary = 10_000;
	
	@Autowired
	@Lazy
	private Address adddress;
	
	public void turnOn() {
		System.out.println("Load operating system");
	}

	public void turnOff() {
		System.out.println("Close all programs");
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
}
