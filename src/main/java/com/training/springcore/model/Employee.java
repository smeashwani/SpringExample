package com.training.springcore.model;

import java.util.List;
import java.util.Map;

public class Employee {

	private String name;
	int age;
	int salary;
	Address address;
	List<String> qualification;
	Map<Address, String> answers;

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
