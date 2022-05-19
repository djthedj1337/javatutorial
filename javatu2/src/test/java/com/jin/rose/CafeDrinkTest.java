package com.jin.rose;

public class CafeDrinkTest {
    public static void main(String[] args){
        CafeLatte m = new CafeLatte();
        m.setPrice(4.15);

        CafeLatte o = new CafeLatte();
        o.setPrice(4.15);
        o.addOns("oat");

        CafeLatte a = new CafeLatte();
        a.setPrice(4.15);
        a.addOns("almond");

        System.out.println("Cafe Latte: $"+ m.getPrice());
        System.out.println("Cafe Latte with Oat Milk: $"+ o.getPrice());
        System.out.println("Cafe Latte with Almond Milk: $"+ a.getPrice());

    }
}
