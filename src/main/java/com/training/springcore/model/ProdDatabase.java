package com.training.springcore.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDatabase implements IDatabase {

	@Value("${prod.username}")
	private String userName;
	
	@Value("${prod.password}")
	private String password;

	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "ProdDatabase [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
