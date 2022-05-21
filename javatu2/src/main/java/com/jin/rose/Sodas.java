package com.jin.rose;

public class Sodas implements DrinksInterface {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void temp(){
        System.out.println("Sodas are cold drinks.");
    }

    public void calories(){
        System.out.println("There are roughly 150 calories per soda.");
    }

    public void carbonation(){
        System.out.println("Sodas do have carbonation.");

    }
}
