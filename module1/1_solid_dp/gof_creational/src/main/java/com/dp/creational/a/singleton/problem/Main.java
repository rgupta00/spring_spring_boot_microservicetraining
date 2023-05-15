package com.dp.creational.a.singleton.problem;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{

        Singleton singleton1=Singleton.getSingleton();

        System.out.println(singleton1.hashCode());

        //how to call even private ctr using java refleaction?
        Class<?> clazz=Class.forName("com.dp.creational.a.singleton.problem.Singleton");
        Constructor[]constructors=clazz.getDeclaredConstructors();

        constructors[0].setAccessible(true);// even if that is a private ctr just call that
        Singleton singleton2= (Singleton) constructors[0].newInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        //Java Reflection ?Spring use it heavly, AOP from core java
        //to know inforamtion of class at run time



//        Runtime runtime=Runtime.getRuntime();
//        Runtime runtime2=Runtime.getRuntime();
//        System.out.println(runtime.hashCode());
//        System.out.println(runtime2.hashCode());
    }
}
