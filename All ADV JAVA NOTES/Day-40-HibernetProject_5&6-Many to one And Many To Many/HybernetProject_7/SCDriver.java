package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import com.nit.dto.Course;
import com.nit.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SCDriver {
     //many to many
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Student s1=new Student();
        s1.setName("Mahi");
        s1.setMob_num(75682539l);
        
        Student s2=new Student();
        s2.setName("Sakshi");
        s2.setMob_num(85693245l);
        
        Course c1=new Course();
        c1.setC_name("JAVA");
        c1.setFee(20000);
        
        Course c2=new Course();
        c2.setC_name("PYTHON");
        c2.setFee(18000);
        
        
        List<Course>list=new ArrayList<Course>();
        list.add(c1);
        list.add(c2);
        
        s1.setCourse(list);
        s2.setCourse(list);
        
        et.begin();
        em.persist(c1);
        em.persist(c2);
        em.persist(s1);
        em.persist(s2);
        et.commit();
        
        System.out.println("Data Has Been Inserted Sucessfully...");
        
        

	}

}
