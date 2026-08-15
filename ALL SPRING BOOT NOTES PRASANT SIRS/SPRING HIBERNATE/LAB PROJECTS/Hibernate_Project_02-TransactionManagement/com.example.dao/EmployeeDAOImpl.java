package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insertEmployee(Employee employee) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(employee);

        transaction.commit();

        session.close();

        System.out.println("Employee Inserted Successfully");
    }

    @Override
    public Employee getEmployeeById(int id) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, id);

        session.close();

        return employee;
    }
}
