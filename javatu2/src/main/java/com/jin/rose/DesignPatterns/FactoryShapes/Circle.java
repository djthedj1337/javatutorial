package com.jin.rose.DesignPatterns.FactoryShapes;

//Polymorphism
public class Circle implements Shape {

    //Encapsulation
    private int radius;

    public Circle(){};

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getCircumference(){
        return 3.14 * radius * 2;
    }

    public String getName(){
        return "This is a Circle created by a Factory Design Pattern.";
    }
}


