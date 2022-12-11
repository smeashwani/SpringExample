package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IDatabase database;
	
	public void getDatabaseDetails(){
		System.out.println(database);
	}
}
