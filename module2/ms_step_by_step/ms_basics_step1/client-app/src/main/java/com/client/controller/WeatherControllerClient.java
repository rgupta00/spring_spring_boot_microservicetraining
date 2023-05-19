package com.client.controller;

import com.client.service.WeatherServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherControllerClient {

    @Autowired
   private WeatherServiceClient client;

    @GetMapping("weatherclient/{temp}")
    public String wetherInfo(@PathVariable int temp){
        return "CLIENT"+ client.callWeatherService(temp);
    }
}
