package com.demo.demo1;

public class Car {
    private String carName;
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
