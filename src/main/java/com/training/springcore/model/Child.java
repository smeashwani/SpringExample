package com.training.springcore.model;

import org.springframework.stereotype.Component;

@Component
public class Child {
	
	private String name;
	public Child() {
	System.out.println("Child.Child()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

