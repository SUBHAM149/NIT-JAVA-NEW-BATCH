package com.nit;

public class EmployeeFactory {

    public static Employee getEmployee(String role) {

        if(role == null) {
            return null;
        }

        if(role.equalsIgnoreCase("Developer")) {
            return new Developer();
        }
        else if(role.equalsIgnoreCase("Tester")) {
            return new Tester();
        }
        else if(role.equalsIgnoreCase("Manager")) {
            return new Manager();
        }

        return null;
    }
}
