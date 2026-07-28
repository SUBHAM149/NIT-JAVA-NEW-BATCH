package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Student;
import com.sub.nit.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/save")
    public String save(@RequestBody Student student) {

        service.saveStudent(student);

        return "Student Saved Successfully";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {

        return service.getAllStudent();
    }

}
