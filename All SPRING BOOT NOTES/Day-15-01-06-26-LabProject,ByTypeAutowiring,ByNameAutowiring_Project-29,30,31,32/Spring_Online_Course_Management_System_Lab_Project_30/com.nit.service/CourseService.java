package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Course;
import com.nit.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public String registerCourse(Course course) {

        if (course.getCourseFee() > 1000) {
            repository.addCourse(course);
            return "Course Added Successfully";
        }

        return "Course Fee Must Be Greater Than 1000";
    }

    public List<Course> displayAllCourses() {
        return repository.getAllCourses();
    }

    public Course findCourse(Integer courseId) {
        return repository.searchCourseById(courseId);
    }
}
