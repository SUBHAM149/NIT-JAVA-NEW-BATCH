package com.sub.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Department;
import com.sub.nit.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    @Override
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartment(Integer id) {
        repo.deleteById(id);
    }
}
