package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Inventory;
import com.nit.beans.Product;
import com.nit.beans.ProductService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService service = context.getBean(ProductService.class);

		Product product = new Product(101, "Laptop", "Electronics", 55000);

		Inventory inventory = new Inventory(1, 101, 50, "Hyderabad");

		service.saveProductAndInventory(product, inventory);

		context.close();
	}
}
