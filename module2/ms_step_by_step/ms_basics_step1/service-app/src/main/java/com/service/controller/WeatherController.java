package com.service.controller;

import com.service.logic.WeatherLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Value("${server.port}")
    private String portNo;

    private Logger logger= LoggerFactory.getLogger(WeatherController.class);
    @Autowired
    private WeatherLogic weatherLogic;

    @GetMapping("weather/{temp}")
    public String wetherInfo(@PathVariable int temp){
        logger.info("----wetherInfo() is called....");
        return weatherLogic.getWeather(temp)+" server port: "+ portNo ;
    }
}
