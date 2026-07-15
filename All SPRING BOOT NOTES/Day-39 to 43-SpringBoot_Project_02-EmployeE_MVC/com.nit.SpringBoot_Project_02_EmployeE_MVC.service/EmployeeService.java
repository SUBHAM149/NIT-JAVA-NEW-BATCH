package com.nit.SpringBoot_Project_02_EmployeE_MVC.service;

import java.util.List;

import com.nit.SpringBoot_Project_02_EmployeE_MVC.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public  Employee getEmployeeById(long id);
	
    public void saveEmployee(Employee emp);
    
    public Employee updateEmployee(long id,Employee emp);
   
    public void deleteEmployee(long id);
}
