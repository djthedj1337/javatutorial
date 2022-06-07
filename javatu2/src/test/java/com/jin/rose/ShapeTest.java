package com.jin.rose;

import com.jin.rose.DesignPatterns.FactoryShapes.Circle;
import com.jin.rose.DesignPatterns.FactoryShapes.Rectangle;
import com.jin.rose.DesignPatterns.FactoryShapes.Shape;
import com.jin.rose.DesignPatterns.FactoryShapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    //polymorphism
    static void processShape(Shape s) {
        System.out.println("Area:" + s.getArea());
        System.out.println("Circumference:" + s.getCircumference());
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(2, 4);
        Triangle t1 = new Triangle(2, 2, 2, 2);

        //Polymorphism
        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(t1);


        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle x = (Rectangle) shape;
                System.out.println("Is this rectangle a square: " + x.isSquare());
            }
            //abstraction
            processShape(shape);
        }
    }
}

