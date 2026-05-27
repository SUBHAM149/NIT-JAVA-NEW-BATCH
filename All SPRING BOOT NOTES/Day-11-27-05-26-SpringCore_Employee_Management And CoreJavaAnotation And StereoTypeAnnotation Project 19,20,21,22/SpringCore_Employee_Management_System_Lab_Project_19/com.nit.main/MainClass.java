package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Company;
import com.nit.config.AppConfig;

public class MainClass
{
    public static void main(String[] args)
    {
        ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

        Company company =
        context.getBean(Company.class);

        company.companyDetails();
    }
}
OUTPUT
------
  ========== COMPANY DETAILS ==========
Company Name : TCS

Employee ID      : 101
Employee Name    : Subham Behera
Employee Salary  : 50000.0

Department Name  : Java Developer
Department Location : Hyderabad

Employee Is Working
