package com.sub.nit.controller;

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
    public Student save(@RequestBody Student student){
        return service.saveStudent(student);
    }

}
