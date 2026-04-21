package com.nit.dao;

import com.nit.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subh");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        
        Employee e=new Employee();
        e.setName("Sarafat");
        e.setDept("Tester");
        e.setSalary(10000);
        e.setMob_num(7682036895l);
        
        et.begin();
        em.persist(e);
        et.commit();
        System.out.println("Data Has Been Inserted Sucessfully...");
	}

}
