package com.example.web_customer_tracker.controller;


import com.example.web_customer_tracker.dao.CustomerDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.SQLException;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/list")
    public String showAllCustomers(Model model){
        model.addAttribute("allCustomers", customerDao.getCustomers());
        return "list-customers";
    }
}
