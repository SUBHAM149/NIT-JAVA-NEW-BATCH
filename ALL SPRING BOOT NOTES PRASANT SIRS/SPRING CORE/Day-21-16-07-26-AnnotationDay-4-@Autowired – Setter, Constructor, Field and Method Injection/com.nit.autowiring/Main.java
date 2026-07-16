package com.nit.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("========== Task 1 ==========");
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout();

        System.out.println();

        System.out.println("========== Task 2 ==========");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.diagnose();

        System.out.println();

        System.out.println("========== Task 3 ==========");
        Library library = context.getBean(Library.class);
        library.issueBook();

        System.out.println();

        System.out.println("========== Task 4 ==========");
        NotificationManager manager = context.getBean(NotificationManager.class);
        manager.notifyUser();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
