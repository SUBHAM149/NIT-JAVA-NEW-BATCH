package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.DatePrinter;

public class Main {

    public static void main(String[] args) {

        
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       
        DatePrinter dp = ctx.getBean("datePrinter", DatePrinter.class);

        
        dp.printDate();

        
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
OUTPUT
------
Current Date is: 2026-05-22
