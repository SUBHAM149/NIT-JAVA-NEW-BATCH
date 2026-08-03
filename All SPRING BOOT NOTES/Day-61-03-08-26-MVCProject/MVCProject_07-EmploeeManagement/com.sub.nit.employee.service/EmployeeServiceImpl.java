package com.sub.nit.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.employee.entity.Employee;
import com.sub.nit.employee.exception.EmployeeNotFoundException;
import com.sub.nit.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Employee existingEmployee = employeeRepository.findById(employee.getId())
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + employee.getId()));
		
		existingEmployee.setEname(employee.getEname());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setDepartment(employee.getDepartment());

		return employeeRepository.save(existingEmployee);
	}

	@Override
	public void deleteEmployee(Integer id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));

		employeeRepository.delete(employee);
	}
}
