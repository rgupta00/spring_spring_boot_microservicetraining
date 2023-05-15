package com.demo.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo2.xml");
        Car car = context.getBean("car", Car.class);
        car.move();
        Car car2 = context.getBean("car", Car.class);

//        System.out.println(car.hashCode());
//        System.out.println(car2.hashCode());

//        Car car=new Car();
//        car.setCarName("best car");
//        car.setTyre(new MrfTyre());
//        car.move();
    }
}
