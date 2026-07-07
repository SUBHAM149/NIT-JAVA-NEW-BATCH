package com.sub.program06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("******** Food Cart ********");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program06/application-context.xml");

        FoodCart cart = context.getBean("foodCart", FoodCart.class);

        System.out.println(cart);
    }

}
