package com.example.jwtproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwtproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
