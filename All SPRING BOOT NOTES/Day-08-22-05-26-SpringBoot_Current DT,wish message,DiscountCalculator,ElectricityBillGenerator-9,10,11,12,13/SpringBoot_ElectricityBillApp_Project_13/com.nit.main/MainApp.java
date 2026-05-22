package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.ElectricityBillGenerator;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Container
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean
        ElectricityBillGenerator ebg =
                ctx.getBean("ebg", ElectricityBillGenerator.class);

        // Generate Bill
        double totalBill = ebg.generateBill();

        // Print Output
        System.out.println("Total Electricity Bill : " + totalBill);

        // Close Container
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
OUTPUT
------
Total Electricity Bill : 1625.0
