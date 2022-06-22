package com.example.exam.controllers;

import com.example.exam.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @GetMapping("/api/time")
    public String getCurrentTime() {
        return new DateService().getCurrentTime();
    }

    @GetMapping("/api/date")
    public String getCurrentDate() {
        return new DateService().getCurrentDate();
    }
}
