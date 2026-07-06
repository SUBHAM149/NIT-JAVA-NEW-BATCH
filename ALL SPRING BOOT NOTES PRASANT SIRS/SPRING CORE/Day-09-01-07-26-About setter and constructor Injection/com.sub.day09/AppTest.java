package com.sub.day09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Traditional way ");
        Resume resume = new Resume(1, "java");
        // resume.setDomain("java");
        // resume.setExperience(1);

        // Student student = new Student();

        Student student = new Student("prashant", 101, "hyd", resume);

        // student.setId(101);
        // student.setAddress("hyd");
        // student.setName("prashant");
        // student.setResume(resume);
        System.out.println(student);

        System.out.println("====================");

        System.out.println("By spring way");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sub/day09/application-context.xml");

        Student bean = context.getBean("studentclass", Student.class);
        System.out.println(bean);
    }
}
