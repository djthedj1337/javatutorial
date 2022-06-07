package com.jin.rose.DesignPatterns.FactoryShapes;

public class Triangle implements Shape {

    private int base;
    private int height;
    private int side1;
    private int side2;


    public Triangle(){};

    public Triangle(int base, int height, int side1, int side2){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    //instance
    public double getArea(){
        return base * height / 2;
    }
    public double getCircumference(){
        return base + side1 + side2;
    }

    public String getName(){
        return "This is a Triangle created by a Factory Design Pattern.";
    }
}
