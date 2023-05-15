package com.oops;

public class Client {
    public static void main(String[] args) {
        Stack stack=new StackImpAmit(5);
        stack.push(2);

        System.out.println(stack.pop());
    }
}
