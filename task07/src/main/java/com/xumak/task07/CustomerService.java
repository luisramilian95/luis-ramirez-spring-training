package com.xumak.task07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO dao;

    public Customer getById(Long id) {
        return (dao.findById(id));
    }

    public List<Customer> getByName(String lastName) {
        return dao.findByLastName(lastName);
    }
}