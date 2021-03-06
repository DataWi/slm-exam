package com.example.exam.service;

public class DateService {
    // initialize date service with current date and time

    //Initialize date variable
    java.util.Date date ;
    public DateService() {
        //initialize date object
         date = new java.util.Date();
    }

        // get current time in hh:mm:ss format
        public String getCurrentTime() {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");
            return sdf.format(this.date);
        }

        // get current date in yyyy-mm-dd format
        public String getCurrentDate() {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-mm-dd");
            return sdf.format(this.date);
        }

        // get current date in yyyy/mm/dd format
        public String getCurrentDate2() {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/mm/dd");
            return sdf.format(this.date);
        }

}

