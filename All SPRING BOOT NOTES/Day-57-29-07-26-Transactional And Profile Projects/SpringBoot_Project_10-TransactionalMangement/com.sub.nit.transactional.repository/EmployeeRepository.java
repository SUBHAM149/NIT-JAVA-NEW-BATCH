package com.sub.nit.transactional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.transactional.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
