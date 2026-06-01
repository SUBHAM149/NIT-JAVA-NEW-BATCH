package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Course;
import com.nit.service.CourseService;

@Controller
public class CourseController {

    @Autowired
    private CourseService service;

    public void addNewCourse(Course course) {
        System.out.println(service.registerCourse(course));
    }

    public void showAllCourses() {

        List<Course> courses = service.displayAllCourses();

        System.out.println("\n===== ALL COURSES =====");

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void searchCourse(Integer courseId) {

        Course course = service.findCourse(courseId);

        if (course != null) {
            System.out.println("\nCourse Found");
            System.out.println(course);
        } else {
            System.out.println("\nCourse Not Found");
        }
    }
}
