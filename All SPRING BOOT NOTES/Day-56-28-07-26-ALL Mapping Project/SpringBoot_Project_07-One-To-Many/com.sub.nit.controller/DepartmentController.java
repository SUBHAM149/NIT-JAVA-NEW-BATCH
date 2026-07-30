package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Department;
import com.sub.nit.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/save")
    public Department save(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @GetMapping("/all")
    public List<Department> getAll() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Integer id) {
        return service.getDepartmentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteDepartment(id);
        return "Department Deleted Successfully";
    }
}
