package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Customer;
import com.nit.beans.DeliveryPartner;
import com.nit.beans.Restaurant;
import com.nit.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		Restaurant restaurant = context.getBean(Restaurant.class);
		DeliveryPartner deliveryPartner = context.getBean(DeliveryPartner.class);
		Customer customer = context.getBean(Customer.class);

		
		restaurant.showRestaurantService();
		deliveryPartner.showDeliveryService();
		customer.showCustomerService();

	}

}
OUTPUT
------
Restaurant is preparing fresh food orders for customers.
Delivery partner is delivering orders to customer locations.
Customer is placing food orders using mobile application.
