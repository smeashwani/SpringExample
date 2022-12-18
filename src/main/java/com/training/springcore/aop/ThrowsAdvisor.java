package com.training.springcore.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("ThrowsAdvisor additional concern if exception occurs");
	}
}
