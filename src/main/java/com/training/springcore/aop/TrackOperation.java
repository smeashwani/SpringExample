package com.training.springcore.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TrackOperation {

	@Before("execution(* com.training.springcore.model.Employee.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before: " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.training.springcore.model..*(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After: " + joinPoint.getSignature().getName());
	}

}
