package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{
	@Autowired
	private Address address;
	
	@Value("#{address.companyName}")
	private String companyName;
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", companyName=" + companyName + "]";
	}	
	
	
}

