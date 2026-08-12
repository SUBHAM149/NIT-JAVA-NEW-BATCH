package com.sub.nit.testing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.testing.entity.Student;
import com.sub.nit.testing.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // SAVE STUDENT
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student s) {
        return studentService.saveStudent(s);
    }

    // GET ALL STUDENTS
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // UPDATE STUDENT
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable int id,
            @RequestBody Student s) {

        return studentService.updateStudent(id, s);
    }

    // DELETE STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        studentService.deleteStudent(id);

        return "Student deleted successfully";
    }
}
