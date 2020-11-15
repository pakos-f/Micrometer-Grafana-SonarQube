package com.example.micrometer.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getUpperCaseString(String input) {
        return input.toUpperCase();
    }
}
