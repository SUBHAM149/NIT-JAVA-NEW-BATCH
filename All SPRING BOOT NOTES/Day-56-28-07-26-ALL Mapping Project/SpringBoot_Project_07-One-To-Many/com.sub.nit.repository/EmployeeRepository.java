package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
