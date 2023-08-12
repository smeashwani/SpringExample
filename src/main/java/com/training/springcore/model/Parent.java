package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
@Component
abstract public class Parent {

	private String name;
	
	public Parent() {
		System.out.println("Parent.Parent()");
	}
	
	@Lookup
	//abstract public Child getChildDetails();
	public Child getChildDetails() {
		return null;
	}

	
	@Autowired
	private Child child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	
}
