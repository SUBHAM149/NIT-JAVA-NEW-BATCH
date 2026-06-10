package com.nit.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @After("execution(* com.nit.aspect.StudentService.*(..))")
    public void afterAdvice() {

        System.out.println("Method Completed");
    }
}
