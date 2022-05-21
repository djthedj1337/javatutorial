package com.jin.rose;

public class Teas implements DrinksInterface {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void temp(){
        System.out.println("Teas are hot drinks.");;
    }
    public void calories(){
        System.out.println("Teas typically have 15 calories per drink.");
    }
    public void carbonation(){
        System.out.println("Teas do not have carbonation.");
    }
}
