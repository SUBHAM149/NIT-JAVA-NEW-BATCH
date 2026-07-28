package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Student;
import com.sub.nit.repository.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Override
    public void saveStudent(Student student) {
        repo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return repo.findAll();
    }

}
