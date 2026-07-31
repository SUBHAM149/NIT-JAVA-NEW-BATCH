package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.nit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
