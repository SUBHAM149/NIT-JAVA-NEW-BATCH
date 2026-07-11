package com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.SpringBoot_Project_01_SpringBootRestApi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
