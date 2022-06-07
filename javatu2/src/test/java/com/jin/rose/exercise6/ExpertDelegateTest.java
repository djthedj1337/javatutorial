package com.jin.rose.exercise6;

import com.jin.rose.DesignPatterns.ExpertDelegate.Window;
import com.jin.rose.DesignPatterns.FactoryShapes.Rectangle;

public class ExpertDelegateTest {
    public static void main(String[] args) {


        Window bedroom = new Window();
        bedroom.setFrame(new Rectangle(2, 3));

        System.out.println(bedroom.getArea());
    }
}
