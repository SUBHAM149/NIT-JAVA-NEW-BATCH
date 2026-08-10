package com.nit.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.security.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
