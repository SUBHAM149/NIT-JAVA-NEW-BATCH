package com.sub.nit.redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.redis.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
