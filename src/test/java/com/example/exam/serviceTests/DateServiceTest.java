package com.example.exam.serviceTests;

import com.example.exam.service.DateService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateServiceTest {
    // add unit tets for DateService
    // Check if the current time is correct
    @Test
    public void testGetCurrentTime() {
        String toTest = String.valueOf(new java.util.Date());
        // create a new DateService object
        DateService dateService = new DateService();

        // Check if current time is correct
        assertEquals(toTest, dateService.getCurrentTime());
    }

    // Check if date format is correct
    @Test
    public void testGetCurrentDate() {
        // check for date format yyyy-mm-dd
        String toTest = String.valueOf(new java.util.Date());
        // create a new DateService object
        DateService dateService = new DateService();
        // Check if date is correct
        assertEquals(toTest, dateService.getCurrentDate());
    }

    // check if getcurrentDate2 is correct
    @Test
    public void testGetCurrentDate2() {
        // check for date format yyyy/mm/dd
        String toTest = String.valueOf(new java.util.Date());
        // create a new DateService object
        DateService dateService = new DateService();
        // Check if date is correct
        assertEquals(toTest, dateService.getCurrentDate2());
    }
}
