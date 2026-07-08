package com.sub.pharmacy.program01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/pharmacy/program01/applicationContext.xml");

		MedicineInventory inventory = context.getBean("medicineInventory", MedicineInventory.class);

		inventory.displayInventory();
	}
}
