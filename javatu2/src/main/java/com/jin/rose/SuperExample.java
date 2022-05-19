package com.jin.rose;

public class SuperExample {
    private int num;


    public SuperExample(){};

    public SuperExample(int num){
        this.num = num;
    }
    public void info(){
        System.out.println("Super class method activated");
    }

    public void move(){
        System.out.println("This is super class method before overriding.");
    }

}

