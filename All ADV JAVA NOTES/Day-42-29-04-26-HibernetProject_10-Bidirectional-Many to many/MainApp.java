package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import com.nit.dto.Student;
import com.nit.dto.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainApp {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("subh");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Students
        Student s1 = new Student();
        s1.setS_name("Raju");

        Student s2 = new Student();
        s2.setS_name("Madhu");

        // Courses
        Course c1 = new Course();
        c1.setC_name("Data Science");

        Course c2 = new Course();
        c2.setC_name(".Net");

        
        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        // Bidirectional mapping
        s1.setCourse(courseList);
        s2.setCourse(courseList);

        c1.setStudent(studentList);
        c2.setStudent(studentList);

        // Save (cascade handles everything)
        et.begin();
        em.persist(s1);
        em.persist(s2);
        et.commit();

        System.out.println("Many-to-Many Data Inserted Successfully...");

       // em.close();
        // emf.close();
    }
}
