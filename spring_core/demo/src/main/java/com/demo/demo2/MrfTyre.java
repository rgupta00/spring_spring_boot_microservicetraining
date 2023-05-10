package com.demo.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// <bean id="tyre2"  class="com.demo.demo1.MrfTyre" primary="true"/>
@Component(value = "tyre2")
//@Primary
public class MrfTyre implements Tyre {
    @Override
    public void rotate() {
        System.out.println("mrf tyre..");
    }
}
