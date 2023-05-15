package com.dp.structural.b.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Greet{
    public String sayHello(){
        return "hello";
    }
}

class SpecialGreeting extends Greet{
    private Greet greet;
    public SpecialGreeting(Greet greet) {
        this.greet = greet;
    }
    public String sayHello(){
        return "Sp "+ greet.sayHello();
    }
}

class DeepawaliSpecialGreeting extends Greet{
    private Greet greet;
    public DeepawaliSpecialGreeting(Greet greet) {
        this.greet = greet;
    }
    public String sayHello(){
        return "Deepawali "+ greet.sayHello();
    }
}


public class DemoDecorator {
    public static void main(String[] args) throws IOException {
        Greet greet=new DeepawaliSpecialGreeting(new SpecialGreeting(new Greet()));

        System.out.println(greet.sayHello());
//        BufferedReader br=
//                new BufferedReader(new FileReader(new File("foo.txt")));
    }
}
