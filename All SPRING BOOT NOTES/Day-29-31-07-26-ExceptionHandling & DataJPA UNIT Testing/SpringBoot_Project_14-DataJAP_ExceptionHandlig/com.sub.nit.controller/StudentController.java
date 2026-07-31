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
    public Student save(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/find/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        service.deleteStudent(id);

        return "Student Deleted Successfully";
    }

}
