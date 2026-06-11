package com.nit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Role (Developer/Tester/Manager): ");
        String role = sc.nextLine();

        Employee employee = EmployeeFactory.getEmployee(role);

        if(employee != null) {
            employee.work();
        } else {
            System.out.println("Invalid Employee Role");
        }

        sc.close();
    }
}
