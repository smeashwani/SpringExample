package com.training.springcore.model;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String companyName = "CompanyName";
	@Value("${common.state}")
	private String state;
	
	
	@Value("${common.city1: defaultCity}")
	private String city;
	//@Value("${Path}")
	@Value("${COMPUTERNAME}")
	private String path;
	@Value("${listOfValues}")
	private String[] block;
	@Value("#{${valuesMap}}")
	private Map<String, Integer> valuesMap;

	public Address() {
		System.out.println("Address.Address()");
	}

	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "Address [companyName=" + companyName + ", state=" + state + ", city=" + city + ", path=" + path
				+ ", block=" + Arrays.toString(block) + ", valuesMap=" + valuesMap + "]";
	}

}
