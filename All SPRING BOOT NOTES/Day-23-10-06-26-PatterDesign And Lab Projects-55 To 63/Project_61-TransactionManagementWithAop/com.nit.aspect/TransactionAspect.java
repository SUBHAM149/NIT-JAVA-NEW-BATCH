package com.nit.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {
	@Before("execution(* com.nit.service.*.*(..))")
	public void startTransaction() {
		System.out.println("Transaction Started....");
	}
    @After("execution(* com.nit.service.*.*(..))")
    public void afterTransaction() {
		System.out.println("Transaction Ended....");
	}
}
