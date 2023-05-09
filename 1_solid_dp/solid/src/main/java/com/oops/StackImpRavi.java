package com.oops;

public class StackImpRavi implements Stack {
   private int x[];
   private int SIZE;
   private int top;
    public StackImpRavi(int size) {
        this.SIZE=size;
        this.x=new int[size];
        top=-1;
    }
    public void push(int element){
        if(top>=SIZE)
            return ;
        else
            x[top++]=element;
    }
    public int pop(){
        if(top==-1)
            return -99;
        else
            return x[top--];
    }
}
