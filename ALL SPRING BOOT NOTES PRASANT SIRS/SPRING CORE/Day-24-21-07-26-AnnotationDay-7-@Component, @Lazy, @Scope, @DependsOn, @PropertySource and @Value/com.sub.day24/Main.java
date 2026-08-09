package com.sub.day24;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main method working");

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.sub.day24");

        BankOperation bean =
                context.getBean("forAllCustomer", BankOperation.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your choice");
            System.out.println("Press 1 for deposite");
            System.out.println("Press 2 for withdraw");
            System.out.println("Press 3 for check balance");
            System.out.println("Press 4 for generate report");
            System.out.println("Press 5 for exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the amount for deposite");

                    long depositeAmount = sc.nextLong();

                    bean.deposite(depositeAmount);

                    break;

                case 2:
                    System.out.println("Enter the amount for withdraw");

                    long withdrawAmount = sc.nextLong();

                    bean.withdraw(withdrawAmount);

                    break;

                case 3:
                    bean.showBalance();

                    break;

                case 4:
                    BankReportGeneration bean2 =
                            context.getBean("report",
                                    BankReportGeneration.class);

                    bean2.reportGenerated();

                    break;

                case 5:
                    System.out.println(
                            "Thanks for using this application. Namaste");

                    System.exit(0);

                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
