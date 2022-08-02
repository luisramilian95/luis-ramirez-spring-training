package com.xumak.task07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    CustomerDAO repository;

    @InjectMocks
    CustomerService service;

    @Test
    public void testGetById() {
        Customer customer = new Customer("Jack", "Bauer");
        customer.setId(1L);

        Mockito.when(repository.findById(1L)).thenReturn(customer);

        Customer actual = service.getById(1L);

        Assertions.assertEquals(customer, actual);
    }


    @Test
    public void testGetByLastName() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer("Jack", "Bauer");
        customer.setId(1L);
        customers.add(customer);

        Customer customer1 = new Customer("Jacky", "Bauer");
        customer1.setId(2L);
        customers.add(customer1);

        Customer customer2 = new Customer("Nobody", "No Bauer");
        customer2.setId(3L);
        customers.add(customer2);

        Mockito.when(repository.findByLastName("Bauer")).thenReturn(customers.stream().filter(c -> "Bauer".equals(c.getLastName())).collect(Collectors.toList()));

        List<Customer> expected = service.getByName("Bauer");

        Assertions.assertEquals(2, expected.size());
    }






}
