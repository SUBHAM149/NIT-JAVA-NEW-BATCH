package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Customer;

public interface CustomerService {

    // Save Customer
    public Customer saveCustomer(Customer customer);

    // Get All Customers
    public List<Customer> getAllCustomers();

    // Get Customer By Id
    public Customer getCustomerById(Integer id);

    // Update Customer
    public Customer updateCustomer(Integer id, Customer customer);

    // Delete Customer
    public String deleteCustomer(Integer id);

}
