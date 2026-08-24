package com.sub.nit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sub.nit.entity.Employee;

public class EmployeeDao {

    private SessionFactory sessionFactory;

    public EmployeeDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Save Employee and IdentityCard
    public void saveEmployee(Employee employee) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(employee);

        transaction.commit();

        session.close();
    }

    // Retrieve Employee by employeeId
    public Employee getEmployeeById(int employeeId) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, employeeId);

        session.close();

        return employee;
    }
}
