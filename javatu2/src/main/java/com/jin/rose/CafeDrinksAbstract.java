package com.jin.rose;

public abstract class CafeDrinksAbstract {
    private String name;
    private double price;
    private String temp;

    public abstract void addOns(String addOns);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
