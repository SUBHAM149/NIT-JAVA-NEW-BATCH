package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Student;
import com.sub.nit.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Integer id, Student student) {

        Student dbStudent = repo.findById(id).orElse(null);

        if (dbStudent != null) {
            dbStudent.setName(student.getName());
            dbStudent.setEmail(student.getEmail());
            dbStudent.setMobile(student.getMobile());

            return repo.save(dbStudent);
        }

        return null;
    }

    public String deleteStudent(Integer id) {

        repo.deleteById(id);

        return "Student Deleted Successfully";
    }
}
