package com.example.web_customer_tracker.dao;

import com.example.web_customer_tracker.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getCustomers();
}
