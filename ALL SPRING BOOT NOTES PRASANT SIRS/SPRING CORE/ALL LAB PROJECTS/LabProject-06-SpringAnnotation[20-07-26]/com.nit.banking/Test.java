package com.nit.banking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankAccount account = context.getBean(BankAccount.class);

        account.display();

        context.close();

    }

}
