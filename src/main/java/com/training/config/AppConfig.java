package com.training.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.springcore.model.Address;
import com.training.springcore.model.Child;
import com.training.springcore.model.ParentLookup;

@Configuration
@ComponentScan(basePackages= "com.training")
//@Import({Employee.class})
public class AppConfig {

	
	
	//@Bean
	@Bean(initMethod="turnOn", destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
	
}
