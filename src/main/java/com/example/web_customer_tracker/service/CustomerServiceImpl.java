package com.example.web_customer_tracker.service;

import com.example.web_customer_tracker.dao.CustomerDao;
import com.example.web_customer_tracker.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public Customer getCustomerById(Long id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveOrUpdateCustomer(Customer customer) {
        customerDao.saveOrUpdateCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        customerDao.deleteById(id);
    }
}
