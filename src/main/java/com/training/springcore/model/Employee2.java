package com.training.springcore.model;

public class Employee2 {

	private String name;
	int age;
	int salary;
	Address address;
	
	public Employee2() {
	}
	
	
	public Employee2(String name, int age, int salary, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
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