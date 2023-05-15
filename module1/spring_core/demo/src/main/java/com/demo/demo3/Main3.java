package com.demo.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.move();
//        Car car2 = context.getBean("car", Car.class);
//
//        System.out.println(car.hashCode());
//        System.out.println(car2.hashCode());

//        Car car=new Car();
//        car.setCarName("best car");
//        car.setTyre(new MrfTyre());
//        car.move();
    }
}
