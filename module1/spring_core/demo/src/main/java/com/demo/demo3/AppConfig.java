package com.demo.demo3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Configuration
@ComponentScan(basePackages = {"com.demo.demo3"})
public class AppConfig {

    @Scope(BeanDefinition.SCOPE_SINGLETON)
    @Bean(name = "car")
    public Car jlkjlkj(Tyre tyre){
        Car car=new Car();
        car.setCarName("big car");
        car.setTyre(tyre);
        return car;
    }
    @Primary
    public Tyre ceatTyre(){
        return new CeatTyre();
    }

    @Bean
    public Tyre mrfType(){
        return new MrfTyre();
    }
}
