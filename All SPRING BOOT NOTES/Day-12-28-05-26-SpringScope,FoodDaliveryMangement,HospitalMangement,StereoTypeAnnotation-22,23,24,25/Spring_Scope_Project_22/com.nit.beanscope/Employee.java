package com.nit.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Employee {
	
	   @Value("SUbham")
       String name;
	   @Value("Dev")
       String dept;
}
