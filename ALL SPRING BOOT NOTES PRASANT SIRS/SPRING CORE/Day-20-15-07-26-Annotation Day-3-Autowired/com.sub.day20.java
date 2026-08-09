package com.sub.day20;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class A {

    int a;

}

package com.sub.day20;


public class Course {

    private String name;

    public Course() {
        System.out.println("Course Object Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + "]";
    }

}


package com.sub.day20;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Course course;

    public Student() {
        System.out.println("Student Default Constructor");
    }

    // Uncomment for Constructor Injection Example

    /*
    @Autowired(required = false)
    public Student(Course course) {
        System.out.println("Student Parameterized Constructor");
        this.course = course;
    }
    */

    public Course getCourse() {
        return course;
    }

    // Uncomment for Setter @Autowired Example

    @Autowired(required = false)
    public void setCourse(Course course) {
        System.out.println("Setter Called");
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [course=" + course + "]";
    }

}


package com.sub.day20;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        System.out.println();

        Student student = context.getBean("student", Student.class);

        System.out.println(student);

        A a = context.getBean("a", A.class);

        System.out.println(a);

    }

}

