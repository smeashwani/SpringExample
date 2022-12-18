package com.training.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration(proxyBeanMethods = true)
@ComponentScan(basePackages= "com.training.springcore")
@EnableAspectJAutoProxy
public class AopConfig {

	
	
}
