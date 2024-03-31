package com.erolsafauzun.customerservice.service.impl;

import com.erolsafauzun.customerservice.entity.Customer;
import com.erolsafauzun.customerservice.repository.CustomerRepository;
import com.erolsafauzun.customerservice.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
