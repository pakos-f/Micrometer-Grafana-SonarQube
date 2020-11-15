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

    /**
     *  Gets the request and return the response(only for string types) in upper case.
     *
     * @return          Upper case string.
     */
    @Timed("restControllerTest")  // calculates the time that a request has spend in this method.
    @GetMapping(value = "/test")
    public String test() {
        return myService.getUpperCaseString("test");
    }
}

