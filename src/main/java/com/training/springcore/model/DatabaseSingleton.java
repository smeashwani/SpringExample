package com.training.springcore.model;

public class DatabaseSingleton {
	
	private DatabaseSingleton() {}
	
	private static DatabaseSingleton obj = new DatabaseSingleton();
	
	public static DatabaseSingleton getInstance() {
		return obj;
	}
	
	

}
