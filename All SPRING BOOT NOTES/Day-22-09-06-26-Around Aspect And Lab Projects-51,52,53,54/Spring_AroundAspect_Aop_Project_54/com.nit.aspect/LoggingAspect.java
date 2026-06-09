package com.nit.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
      
	@Before("execution(* com.nit.service.*.*(..))")
	public void beforMethod()
	{
		System.out.println("Method Started..");
	}
	@After("execution(* com.nit.service.*.*(..))")
	public void afterMethod()
	{
		System.out.println("Method Stop..");
	}
}
