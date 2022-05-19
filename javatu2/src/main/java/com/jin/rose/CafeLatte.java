package com.jin.rose;

public class CafeLatte extends CafeDrinksAbstract {
    private double extraPrice = 0;
    private double price;

    public void addOns(String milk) {
        if (milk == "almond") {
            this.extraPrice = 2.0;
        }else if (milk == "oat") {
            this.extraPrice = 3.0;
        }
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price + this.extraPrice;
    }
}
