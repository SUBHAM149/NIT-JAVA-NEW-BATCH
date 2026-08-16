package com.nit.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Employee employee) {

        Session session = sessionFactory.getCurrentSession();

        session.persist(employee);

        System.out.println("Employee Saved In Database");
    }
}
