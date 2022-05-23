package com.jin.rose.Shapes;

import com.jin.rose.Shapes.Shape;

public class Rectangle implements Shape {

    private int length;
    private int width;

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
}


