package com.demo.demo2;

import org.springframework.stereotype.Component;

// <bean id="tyre1"  class="com.demo.demo1.CeatTyre" />
@Component(value = "tyre1")
public class CeatTyre implements Tyre {
    @Override
    public void rotate() {
        System.out.println("Ceat tyre..");
    }
}
