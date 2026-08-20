package com.sub.nit.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.student.client.CourseClient;
import com.sub.nit.student.dto.Course;
import com.sub.nit.student.dto.StudentResponse;
import com.sub.nit.student.entity.Student;
import com.sub.nit.student.repo.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseClient courseClient;

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {

        return studentRepository.findById(studentId)
                .orElse(null);
    }

    @GetMapping("/{studentId}/course")
    public StudentResponse getStudentCourse(@PathVariable Integer studentId) {

        Student student = studentRepository.findById(studentId)
                .orElse(null);

        if (student == null) {
            return null;
        }

        Course course = courseClient.getCourseById(student.getCourseId());

        StudentResponse response = new StudentResponse();

        response.setStudentId(student.getStudentId());
        response.setStudentName(student.getStudentName());
        response.setCourseId(student.getCourseId());

        response.setCid(course.getCid());
        response.setCname(course.getCname());
        response.setCfees(course.getCfees());

        return response;
    }
}
