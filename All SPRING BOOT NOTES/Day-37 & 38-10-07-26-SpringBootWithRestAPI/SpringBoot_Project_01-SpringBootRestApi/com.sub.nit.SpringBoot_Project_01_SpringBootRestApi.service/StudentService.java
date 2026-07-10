package com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.service;
import java.util.List;

import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.entity.Student;
public interface StudentService {
	
       public List<Student> getAllStudent();
       
       public void getAllStudentById(int id);
       
       public void saveStudent(Student s);
       
       public void updateStudent(int id,Student s);
       
       public void deleteStudent(int id);
}
