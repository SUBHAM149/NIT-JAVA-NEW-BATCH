package com.nit.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	 @Before("execution(public void com.nit.aspect.StudentService.saveStudent())")
	    public void logBeforeMethod() {

	        System.out.println("LOG : saveStudent() method is about to execute...");
	    }
}
