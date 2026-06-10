package com.nit.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.nit.aspect.StudentService.*(..))")
    public void logMethodStart() {

        System.out.println("Logging : Method Execution Started");
    }
}
