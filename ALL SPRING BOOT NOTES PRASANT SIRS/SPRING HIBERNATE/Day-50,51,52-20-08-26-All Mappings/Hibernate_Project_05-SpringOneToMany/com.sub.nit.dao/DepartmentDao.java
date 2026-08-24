package com.sub.nit.dao;

import com.sub.nit.entity.Department;

public interface DepartmentDao {

    // Save Department with Employees
    void saveDepartment(Department department);

    // Fetch Department by ID
    Department getDepartmentById(int departmentId);
}
