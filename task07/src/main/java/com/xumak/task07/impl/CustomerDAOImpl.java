package com.xumak.task07.impl;

import com.xumak.task07.Customer;
import com.xumak.task07.CustomerDAO;
import com.xumak.task07.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    CustomerRepository repository;

    @Override
    public Customer findById(Long id) {
        Optional<Customer> customer = (repository.findById(id));
        return customer.orElse(null);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

}
