package com.dp.creational.a.singleton.problem;

public class Singleton {
    //eager vs lazy
    public volatile   static Singleton singleton;
    //java refl can beaak encapsulation
    private Singleton() {
        if(singleton!=null){
            throw new IllegalStateException("singleton is already created");
        }
        System.out.println("dare to call");
    }
    //t1   ----  t2== double lock checkng :(  broken (Ex)
    public  static  Singleton getSingleton(){
        if(singleton==null){
           synchronized (Singleton.class) {
              if(singleton==null){
                  singleton = new Singleton();
              }
           }
        }
        return  singleton;
    }
}
