package com.sub.nit.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.nit.profile.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
