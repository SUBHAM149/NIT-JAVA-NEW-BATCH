package com.sub.day24;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("report")
@Lazy
public class BankReportGeneration {

    public BankReportGeneration() {

        System.out.println("All format uploaded");
        System.out.println("All format converted into database");
        System.out.println("All the value is verified");
        System.out.println("All the environment is verified");
    }

    public void reportGenerated() {

        System.out.println("All customer data is stored!");
    }
}
