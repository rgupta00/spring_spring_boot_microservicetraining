package com.service.controller;

import com.service.logic.WeatherLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherLogic weatherLogic;
    @GetMapping("weather/{temp}")
    public String wetherInfo(@PathVariable int temp){
        return weatherLogic.getWeather(temp) ;
    }
}
