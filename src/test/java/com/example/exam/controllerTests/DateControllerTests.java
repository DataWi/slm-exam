package com.example.exam.controllerTests;

import com.example.exam.controllers.DateController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DateControllerTests {

    @Autowired private DateController dateController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(dateController).isNotNull();
    }

}
