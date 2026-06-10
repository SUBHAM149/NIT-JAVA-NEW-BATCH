package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.BankService;

public class Main {
	public static void main(String[] args) {
	    
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
     	BankService bs=context.getBean(BankService.class);
     	bs.transferMoney();
		
		
		
	}
}
