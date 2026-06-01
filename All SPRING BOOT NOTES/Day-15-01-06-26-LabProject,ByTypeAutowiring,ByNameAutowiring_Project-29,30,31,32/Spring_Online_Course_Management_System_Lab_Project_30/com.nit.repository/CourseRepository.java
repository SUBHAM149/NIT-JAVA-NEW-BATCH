package com.nit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.model.Course;

@Repository
public class CourseRepository {

    private List<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public List<Course> getAllCourses() {
        return courseList;
    }

    public Course searchCourseById(Integer courseId) {

        for (Course course : courseList) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }

        return null;
    }
}
