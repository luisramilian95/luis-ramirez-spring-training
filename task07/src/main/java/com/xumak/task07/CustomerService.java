package com.xumak.task07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public Customer getById(Long id) {
        Optional<Customer> customer = (repository.findById(id));
        return customer.orElse(null);
    }

    public List<Customer> getByName(String lastName) {
        return repository.findByLastName(lastName);
    }
}