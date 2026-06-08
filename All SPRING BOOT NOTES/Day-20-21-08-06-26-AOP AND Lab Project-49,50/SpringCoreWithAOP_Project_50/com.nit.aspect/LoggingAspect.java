package com.nit.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.nit.service.StudentService.*(..))")
    public void beforeMethod() {

        System.out.println("Before Advice : Method Started");
    }

    @After("execution(* com.nit.service.StudentService.*(..))")
    public void afterMethod() {

        System.out.println("After Advice : Method Completed");
    }

    @Around("execution(* com.nit.service.StudentService.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("Around Advice : Before Method");

        Object result = pjp.proceed(); // calls target method

        System.out.println("Around Advice : After Method");

        return result;
    }
}
