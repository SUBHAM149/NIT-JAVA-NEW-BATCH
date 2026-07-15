package com.nit.SpringBoot_Project_02_EmployeE_MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.SpringBoot_Project_02_EmployeE_MVC.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
