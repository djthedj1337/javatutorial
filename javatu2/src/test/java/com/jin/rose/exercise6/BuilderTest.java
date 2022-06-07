package com.jin.rose.exercise6;

import com.jin.rose.DesignPatterns.Builder.McDonaldsMeal;

public class BuilderTest {
    public static void main(String[] args) {
        McDonaldsMeal meal1 = new McDonaldsMeal();
        McDonaldsMeal meal2 = new McDonaldsMeal();

        meal1.setBurger("McDouble").setSide("Fries").setDrink("Diet Coke").setCost(10);
        meal2.setBurger("McChicken").setSide("No Side").setDrink("Sprite").setCost(8);


        System.out.println(meal1);
        System.out.println(meal2);

    }
}
