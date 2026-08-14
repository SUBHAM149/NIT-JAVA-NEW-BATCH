package com.example.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository repository;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {

		return repository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
	}

	@Override
	public Employee getEmployeeByName(String name) {

		return repository.findByName(name)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with name: " + name));
	}

	@Override
	public Employee getEmployeeByEmail(String email) {

		return repository.findByEmail(email)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with email: " + email));
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {

		Employee existingEmployee = getEmployeeById(id);

		existingEmployee.setName(employee.getName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setDepartment(employee.getDepartment());

		return repository.save(existingEmployee);
	}

	@Override
	public void deleteEmployee(Long id) {

		Employee employee = getEmployeeById(id);

		repository.delete(employee);
	}
}
