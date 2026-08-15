package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Service Bean
        EmployeeService service =
                context.getBean("employeeService", EmployeeService.class);


        // =========================
        // Operation 1 - INSERT
        // =========================

//        Employee employee =
//                new Employee(102, "Subham", 60000, "IT");
//
//        service.insertEmployee(employee);


        // =========================
        // Operation 2 - SELECT
        // =========================

        Employee result =
                service.getEmployeeById(102);

        System.out.println();
        System.out.println("Employee Details");
        System.out.println("-------------------------");

        if (result != null) {

            System.out.println("ID : " + result.getId());
            System.out.println("Name : " + result.getName());
            System.out.println("Salary : " + result.getSalary());
            System.out.println("Department : " + result.getDepartment());

        } else {

            System.out.println("Employee Not Found");
        }

        ((ClassPathXmlApplicationContext) context).close();
    }
}
