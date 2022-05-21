package com.jin.rose;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class InterfaceTest {
    public static void main(String[] args) {
        Sodas mDew = new Sodas();
        Sodas sprite = new Sodas();
        Sodas coke = new Sodas();

        Teas black = new Teas();
        Teas green = new Teas();
        Teas white = new Teas();

        mDew.setName("Mountain Dew");
        sprite.setName("Sprite");
        coke.setName("Coca Cola");
        black.setName("Black Tea");
        green.setName("Green Tea");
        white.setName("White Tea");

        List<DrinksInterface> popular = new ArrayList<>();
        popular.add(mDew);
        popular.add(sprite);
        popular.add(coke);
        popular.add(black);
        popular.add(green);
        popular.add(white);

        for (int i = 0; i < popular.size(); i++) {
            System.out.println((popular.get(i)).getName());
        }
    }
}

