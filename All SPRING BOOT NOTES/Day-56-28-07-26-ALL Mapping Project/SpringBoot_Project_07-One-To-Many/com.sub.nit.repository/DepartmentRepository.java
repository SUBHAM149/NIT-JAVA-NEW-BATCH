package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
