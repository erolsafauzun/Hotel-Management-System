package com.erolsafauzun.customerservice.repository;

import com.erolsafauzun.customerservice.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
