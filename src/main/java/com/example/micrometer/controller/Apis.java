package com.example.micrometer.controller;

import com.example.micrometer.service.MyService;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis {

    private final MyService myService;

    public Apis(MyService myService) {
        this.myService = myService;
    }

    @Timed("restControllerTest")
    @GetMapping(value = "/test")
    private String test() {
        return myService.getUpperCaseString("test");
    }
}

