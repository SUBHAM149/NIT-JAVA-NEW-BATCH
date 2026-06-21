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
