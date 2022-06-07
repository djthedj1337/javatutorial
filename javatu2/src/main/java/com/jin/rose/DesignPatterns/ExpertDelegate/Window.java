package com.jin.rose.DesignPatterns.ExpertDelegate;

import com.jin.rose.DesignPatterns.FactoryShapes.Rectangle;

public class Window {
    private Rectangle frame;
    private String color;

    public Rectangle getFrame() {
        return frame;
    }

    public void setFrame(Rectangle frame) {
        this.frame = frame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return frame.getArea();
    }



}
