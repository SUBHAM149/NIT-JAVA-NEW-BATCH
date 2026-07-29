package com.sub.nit.profile.service;

import java.util.List;
import com.sub.nit.profile.entity.Employee;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAll();

}
