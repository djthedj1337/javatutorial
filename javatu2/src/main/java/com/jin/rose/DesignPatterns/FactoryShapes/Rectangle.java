package com.jin.rose.DesignPatterns.FactoryShapes;

public class Rectangle implements Shape {

    private int length;
    private int width;


    public Rectangle(){};
    //instance
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    //instance
    public double getArea(){
        return length * width;
    }
    public double getCircumference(){
        return (length + width) * 2;
    }

    //instance
    public boolean isSquare() {
        return length == width;
    }

    public String getName(){
        return "This is a Rectangle created by a Factory Design Pattern.";
    }
}


