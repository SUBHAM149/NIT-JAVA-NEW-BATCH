package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Employee;
import com.nit.config.AppConfig;
import com.nit.controller.EmployeeController;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeController controller =
                context.getBean(EmployeeController.class);

        controller.addEmployee(new Employee(101, "Subham", "Java Developer", 50000));
        controller.addEmployee(new Employee(102, "Rahul", "Software Engineer", 55000));
        controller.addEmployee(new Employee(103, "Priya", "Tester", 45000));
        controller.addEmployee(new Employee(104, "Amit", "Team Lead", 75000));
        controller.addEmployee(new Employee(105, "Neha", "HR Executive", 40000));

        controller.showEmployees();
    }
}
