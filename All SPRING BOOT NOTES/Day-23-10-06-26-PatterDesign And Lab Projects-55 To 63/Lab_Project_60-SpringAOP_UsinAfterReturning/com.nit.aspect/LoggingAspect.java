package com.nit.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.nit.beans.Student;

@Aspect
@Component
public class LoggingAspect {

	@AfterReturning(pointcut = "execution(* com.nit.beans.StudentService.getStudent(..))", returning = "result")
	public void afterReturningAdvice(Student result) {

		System.out.println("Method Returned Successfully");
		System.out.println("Returned Object : " + result);
	}
}
