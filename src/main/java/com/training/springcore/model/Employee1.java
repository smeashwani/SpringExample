package com.training.springcore.model;

import java.util.List;
import java.util.Map;

public class Employee1 {

	private String name;
	int age;
	int salary;
	Address address;
	List<String> qualification;
	Map<String, Object> answers;
	
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
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public Map<String, Object> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, Object> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ ", qualification=" + qualification + ", answers=" + answers + "]";
	}
	
	
	
	
}