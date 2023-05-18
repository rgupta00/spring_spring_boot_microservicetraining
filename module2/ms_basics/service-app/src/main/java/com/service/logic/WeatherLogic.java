package com.service.logic;

import org.springframework.stereotype.Service;

@Service
public class WeatherLogic {
    public String getWeather(int temp){
        String weatherValue=null;
        if(temp<18){
            weatherValue="dont go out it is very cold!";
        }else  if(temp<25){
            weatherValue="great weather, go for outing";
        }else  if(temp<40){
            weatherValue="go for outing only in evening";
        }
        else
            weatherValue="to hot for outing";

        return weatherValue;
    }
}
