package com.sub.nit.transactional.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sub.nit.transactional.entity.Employee;
import com.sub.nit.transactional.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    @Transactional
    public String transferSalary(Integer senderId,
                                 Integer receiverId,
                                 Double amount) {

        Employee sender = repo.findById(senderId).orElse(null);
        Employee receiver = repo.findById(receiverId).orElse(null);

        if (sender == null) {
            return "Sender Employee Not Found";
        }

        if (receiver == null) {
            return "Receiver Employee Not Found";
        }

        if (sender.getSalary() < amount) {
            return "Insufficient Salary";
        }

        sender.setSalary(sender.getSalary() - amount);
        receiver.setSalary(receiver.getSalary() + amount);

        repo.save(sender);
        repo.save(receiver);

        return "Salary Transferred Successfully";
    }

}
