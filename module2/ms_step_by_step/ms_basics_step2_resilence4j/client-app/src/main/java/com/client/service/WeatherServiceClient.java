package com.client.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class WeatherServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    int count=0;
    @Retry(fallbackMethod = "fallbackWeatherService", name = "weatherservice")
    //@CircuitBreaker(fallbackMethod = "fallbackWeatherService", name = "weatherservice")
    public String callWeatherService( int temp){
        System.out.printf("-------counter value is : "+ ++ count+": "+LocalDateTime.now());
        System.out.println();
        return restTemplate.getForObject("http://WEATHER-SERVICE/weather/"+temp, String.class);
    }
    public String fallbackWeatherService(Exception e){
        return "ok ok";
    }
}
