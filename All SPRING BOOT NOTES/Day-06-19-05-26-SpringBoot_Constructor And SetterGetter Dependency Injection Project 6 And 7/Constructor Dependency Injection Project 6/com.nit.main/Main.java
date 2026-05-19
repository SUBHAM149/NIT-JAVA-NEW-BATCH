package com.nit.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.
ClassPathXmlApplicationContext;

import com.nit.beans.Car;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");    
        Car c = (Car) context.getBean("cId");
        c.display();   
        System.out.println(c);
    }
}
OUTPUT
------
Car Name: BMW
Car Model: X5
Car Price: 750000.0
Car Color: BLACK
Engine is: Engine [e_id=8523, e_Type=Petrol Engine, e_Price=50000.0]
Car [c_name=BMW, c_model=X5, c_price=750000.0, c_color=BLACK, engine=Engine [e_id=8523, e_Type=Petrol Engine, e_Price=50000.0]]
