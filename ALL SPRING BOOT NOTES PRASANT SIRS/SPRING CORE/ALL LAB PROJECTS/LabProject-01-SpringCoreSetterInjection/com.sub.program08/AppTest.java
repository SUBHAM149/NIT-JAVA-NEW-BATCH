package com.sub.program08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("******** Recharge Plan ********");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/sub/program08/application-context.xml");

        RechargePlan plan =
                context.getBean("rechargePlan", RechargePlan.class);

        System.out.println(plan);
    }

}
