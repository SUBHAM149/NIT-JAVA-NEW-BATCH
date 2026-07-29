package com.sub.nit.transactional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.transactional.entity.Employee;
import com.sub.nit.transactional.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {

        return service.saveEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {

        return service.getAllEmployees();
    }

    @PostMapping("/transfer/{senderId}/{receiverId}/{amount}")
    public String transfer(@PathVariable Integer senderId,
                           @PathVariable Integer receiverId,
                           @PathVariable Double amount) {

        return service.transferSalary(senderId,
                                      receiverId,
                                      amount);
    }

}
