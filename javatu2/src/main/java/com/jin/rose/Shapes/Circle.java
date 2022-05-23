package com.jin.rose.Shapes;

import com.jin.rose.Shapes.Shape;

//Polymorphism
public class Circle implements Shape {

    //Encapsulation
    private int radius;


    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getCircumference(){
        return 3.14 * radius * 2;
    }
}


