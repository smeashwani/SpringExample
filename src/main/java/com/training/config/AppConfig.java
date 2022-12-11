package com.training.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.springcore.model.Child;
import com.training.springcore.model.Parent;

@Configuration
@ComponentScan(basePackages= "com.training")
public class AppConfig {

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
