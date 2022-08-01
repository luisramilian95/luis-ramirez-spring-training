package com.xumak.task07;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = { CustomerRepository.class})
public class CustomerServiceTest {

    @Mock
    CustomerRepository repository;

    @InjectMocks
    CustomerService service;

    @Test
    public void testGetById() {
        Customer customer = new Customer("Jack", "Bauer");
        customer.setId(1L);

        Mockito.when(repository.findById(1L)).thenReturn(customer);

        Customer actual = service.getById(1L);

        Assertions.assertEquals(customer, customer);

    }




}
