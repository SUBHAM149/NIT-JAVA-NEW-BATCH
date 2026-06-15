package com.nit.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.factory.FoodDeliveryFactory;
import com.nit.service.FoodDeliveryService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Service Type:");
		String serviceType = sc.nextLine();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		FoodDeliveryFactory factory = context.getBean(FoodDeliveryFactory.class);

		FoodDeliveryService service = factory.getDeliveryService(serviceType);

		if (service != null) {
			service.deliverFood();
		} else {
			System.out.println("Invalid Delivery Service");
		}

		sc.close();
	}
}
