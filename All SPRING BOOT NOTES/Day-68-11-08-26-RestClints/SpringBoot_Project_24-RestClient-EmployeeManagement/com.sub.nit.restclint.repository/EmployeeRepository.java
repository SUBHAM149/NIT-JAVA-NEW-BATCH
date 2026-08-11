package com.sub.nit.restclint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.restclint.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
