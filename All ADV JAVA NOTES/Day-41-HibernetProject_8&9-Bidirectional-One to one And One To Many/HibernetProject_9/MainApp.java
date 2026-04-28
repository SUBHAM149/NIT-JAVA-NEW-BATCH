package com.nit.dao;

import java.util.Arrays;

import com.nit.dto.Employee;
import com.nit.dto.Office;

import jakarta.persistence.*;

public class MainApp {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Create Office
        Office o = new Office();
        o.setOffice_name("TCS");
        o.setLocation("Hyderabad");

        // Create Employees
        Employee e1 = new Employee();
        e1.setEmp_name("Raju");
        e1.setSalary(30000);

        Employee e2 = new Employee();
        e2.setEmp_name("Ramesh");
        e2.setSalary(40000);

        // Set relationship
        e1.setOffice(o);
        e2.setOffice(o);

        o.setEmployees(Arrays.asList(e1, e2));

        // Persist
        et.begin();
        em.persist(o); // Cascade will save employees
        et.commit();

        System.out.println("Inserted Successfully");
    }
}
