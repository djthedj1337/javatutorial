package com.jin.rose.exercise6;

import com.jin.rose.DesignPatterns.FactoryShapes.Shape;
import com.jin.rose.DesignPatterns.FactoryShapes.ShapeFactory;

public class ShapeFactoryTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");

        Shape shape2 = shapeFactory.getShape("Rectangle");

        Shape shape3 = shapeFactory.getShape("Triangle");

        System.out.println(shape1.getName());
        System.out.println(shape2.getName());
        System.out.println(shape3.getName());


    }
}
