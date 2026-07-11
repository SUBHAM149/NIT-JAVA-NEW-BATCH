package com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.entity.Student;
import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getAllStudentById(id);
    }

    @PostMapping("/add")
    public String createStudent(@RequestBody Student s) {
        service.saveStudent(s);
        return "Student Added Successfully";
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student s) {
        service.updateStudent(id, s);
        return "Student Updated Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student Deleted Successfully";
    }
}
