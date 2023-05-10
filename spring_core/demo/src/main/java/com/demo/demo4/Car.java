package com.demo.demo4;

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

    private  Tyre tyre;

    private Engin engin;

    @Autowired
    public Car(Tyre tyre, Engin engin) {
        this.tyre = tyre;
        this.engin = engin;
    }
//    @Autowired
//    public Car(String carName) {
//        this.carName = carName;
//    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    public void move(){
        System.out.println("car name "+ carName);
        tyre.rotate();
    }
}
