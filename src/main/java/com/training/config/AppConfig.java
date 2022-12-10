package com.training.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.springcore.model.Address;
import com.training.springcore.model.Child;
import com.training.springcore.model.Parent;

@Configuration
@ComponentScan(basePackages= "com.training")
//@Import({Employee.class})
public class AppConfig {

	@Bean(initMethod="turnOn", destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public Parent getParent(){
		Parent p  = new Parent() {
			@Override
			public Child getChildDetails() {
				return getChild();
			}
		};
		return p;
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Child getChild(){
		return new Child();
	}
	
}
