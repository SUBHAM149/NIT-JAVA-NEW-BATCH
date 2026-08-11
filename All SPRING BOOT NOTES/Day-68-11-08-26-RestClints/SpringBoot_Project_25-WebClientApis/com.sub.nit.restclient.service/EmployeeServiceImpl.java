package com.sub.nit.restclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sub.nit.restclient.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final WebClient webClient;

    public EmployeeServiceImpl() {
        this.webClient = WebClient.create();
    }

    // POST
    @Override
    public Employee saveEmployee(Employee employee) {

        return webClient
                .post()
                .uri("http://localhost:8080/employees")
                .bodyValue(employee)
                .retrieve()
                .bodyToMono(Employee.class)
                .block();
    }

    // GET ALL
    @Override
    public List<Employee> getAllEmployees() {

        Employee[] employees = webClient
                .get()
                .uri("http://localhost:8080/employees")
                .retrieve()
                .bodyToMono(Employee[].class)
                .block();

        return Arrays.asList(employees);
    }

    // GET BY ID
    @Override
    public Employee getEmployeeById(int id) {

        return webClient
                .get()
                .uri("http://localhost:8080/employees/" + id)
                .retrieve()
                .bodyToMono(Employee.class)
                .block();
    }

    // PUT
    @Override
    public Employee updateEmployee(int id, Employee employee) {

        return webClient
                .put()
                .uri("http://localhost:8080/employees/" + id)
                .bodyValue(employee)
                .retrieve()
                .bodyToMono(Employee.class)
                .block();
    }

    // DELETE
    @Override
    public void deleteEmployee(int id) {

        webClient
                .delete()
                .uri("http://localhost:8080/employees/" + id)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
