package com.xumak.task07;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO {

    List<Customer> findByLastName(String lastName);

    Customer findById(Long id);
}
