package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Order;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Order order = (Order) ctx.getBean("order");

        System.out.println(order);
    }
}
OUTPUT
-------
Order [orderId=1001, productName=Laptop, orderAmount=55000.0, partner=DeliveryPartner [partnerId=DP101, partnerName=Ravi, contactNumber=9876543210]]
