package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Lookup;

abstract public class Parent {

	private String name;
	
	public Parent() {
		System.out.println("Parent.Parent()");
	}
	
	@Lookup
	abstract public Child getChildDetails();

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
