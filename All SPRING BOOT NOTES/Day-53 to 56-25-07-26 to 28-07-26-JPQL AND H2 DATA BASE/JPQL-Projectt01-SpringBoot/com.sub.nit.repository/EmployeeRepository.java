package com.sub.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sub.nit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // JPQL
    @Query("SELECT e FROM Employee e WHERE e.department = ?1")
    List<Employee> findByDepartment(String department);

    // Native SQL
    @Query(value = "SELECT * FROM employee WHERE salary > ?1", nativeQuery = true)
    List<Employee> findGreaterSalary(double salary);

}
