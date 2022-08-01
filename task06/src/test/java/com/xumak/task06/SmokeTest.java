package com.xumak.task06;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(controller).isNotNull();
    }
}