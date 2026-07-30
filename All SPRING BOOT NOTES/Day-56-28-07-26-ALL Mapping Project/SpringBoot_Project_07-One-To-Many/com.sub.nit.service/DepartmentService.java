package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Integer id);

    void deleteDepartment(Integer id);
}
