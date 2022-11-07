package com.example.web_customer_tracker.service;

import com.example.web_customer_tracker.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);
    List<Customer> getCustomers();
    void saveOrUpdateCustomer(Customer customer);
    void deleteById(Long id);
}
