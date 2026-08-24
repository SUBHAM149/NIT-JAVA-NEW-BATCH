package com.sub.nit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sub.nit.entity.Department;

public class DepartmentDaoImpl implements DepartmentDao {

    private SessionFactory sessionFactory;

    public DepartmentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Save Department with multiple Employees
    @Override
    public void saveDepartment(Department department) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(department);

        transaction.commit();

        session.close();
    }

    // Fetch Department by ID
    @Override
    public Department getDepartmentById(int departmentId) {

        Session session = sessionFactory.openSession();

        Department department =
                session.get(Department.class, departmentId);

        session.close();

        return department;
    }
}
