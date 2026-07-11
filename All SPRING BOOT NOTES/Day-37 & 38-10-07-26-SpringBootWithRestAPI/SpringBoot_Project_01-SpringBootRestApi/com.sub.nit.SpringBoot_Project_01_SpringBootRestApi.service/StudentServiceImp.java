package com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.entity.Student;
import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public Student getAllStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void saveStudent(Student s) {
        repo.save(s);
    }

    @Override
    public void updateStudent(int id, Student s) {

        Student student = repo.findById(id).orElse(null);

        if (student != null) {
            student.setName(s.getName());
            student.setBranch(s.getBranch());
            student.setMobNum(s.getMobNum());

            repo.save(student);
        }
    }

    @Override
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
