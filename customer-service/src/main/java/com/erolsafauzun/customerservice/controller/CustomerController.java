package com.erolsafauzun.customerservice.controller;

import com.erolsafauzun.customerservice.entity.Customer;
import com.erolsafauzun.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/createCustomer")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
       return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping("inquireAllCustomer")
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerRepository.findAll());
    }

}
