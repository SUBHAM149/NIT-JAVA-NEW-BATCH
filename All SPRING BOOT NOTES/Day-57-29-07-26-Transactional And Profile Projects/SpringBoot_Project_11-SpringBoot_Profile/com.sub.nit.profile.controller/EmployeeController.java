package com.sub.nit.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.profile.entity.Employee;
import com.sub.nit.profile.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.getAll();
    }

}
