package com.demo.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
   <bean id="car" class="com.demo.demo1.Car" autowire="byType">
        <property name="carName" value="best car"/>
    </bean>
 */
@Component(value = "car")
public class Car {

    @Value("best car")
    private String carName;

    @Autowired
    private Tyre tyre;

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void move(){
        System.out.println("car name "+ carName);
        tyre.rotate();
    }
}
