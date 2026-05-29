package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.BankService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BankService service = context.getBean(BankService.class);

		service.init();
		service.transaction();
		service.destroy();
	}

}
OUTPUT
------
Bank Server has been connected.
Bank Server has been connected.
Transaction is happening..
Bank Server has dis-connected.
