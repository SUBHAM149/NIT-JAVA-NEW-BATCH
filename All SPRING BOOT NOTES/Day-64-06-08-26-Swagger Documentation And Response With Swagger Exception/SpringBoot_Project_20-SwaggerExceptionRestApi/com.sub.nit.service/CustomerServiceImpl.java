package com.sub.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Customer;
import com.sub.nit.exception.CustomerNotFoundException;
import com.sub.nit.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    // Save Customer
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    // Get All Customers
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    // Get Customer By Id
    @Override
    public Customer getCustomerById(Integer id) {

        Optional<Customer> optional = customerRepo.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new CustomerNotFoundException("Customer Id " + id + " Not Found");
        }
    }

    // Update Customer
    @Override
    public Customer updateCustomer(Integer id, Customer customer) {

        Optional<Customer> optional = customerRepo.findById(id);

        if (optional.isPresent()) {

            Customer dbCustomer = optional.get();

            dbCustomer.setName(customer.getName());
            dbCustomer.setLocation(customer.getLocation());
            dbCustomer.setMobnum(customer.getMobnum());

            return customerRepo.save(dbCustomer);

        } else {
            throw new CustomerNotFoundException("Customer Id " + id + " Not Found");
        }
    }

    // Delete Customer
    @Override
    public String deleteCustomer(Integer id) {

        Optional<Customer> optional = customerRepo.findById(id);

        if (optional.isPresent()) {
            customerRepo.deleteById(id);
            return "Customer Deleted Successfully...";
        } else {
            throw new CustomerNotFoundException("Customer Id " + id + " Not Found");
        }
    }

}
