package com.training.springcore.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AroundAdvisor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		System.out.println("AroundAdvisor additional concern before actual logic");
		obj = mi.proceed();
		System.out.println("AroundAdvisor additional concern after actual logic");
		return obj;
	}
}
