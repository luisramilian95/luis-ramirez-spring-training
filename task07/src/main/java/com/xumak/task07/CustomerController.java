package com.xumak.task07;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return service.getById(id);
    }

    @RequestMapping
    public List<Customer> getCustomer(@RequestParam String lastName) {
        return service.getByName(lastName);
    }

}