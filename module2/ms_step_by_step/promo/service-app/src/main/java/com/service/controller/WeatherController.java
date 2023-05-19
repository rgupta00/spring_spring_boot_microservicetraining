package com.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("weather/{temp}")
    public String wetherInfo(@PathVariable int temp){
        return "good weather "+ temp;
    }
}
