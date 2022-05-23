package com.jin.rose;

public class StaticOuterAccess {
    private static int number;

    public void addTwo(){
        number += 2;
        System.out.println(number);
    }

    static class StaticInnerAccess{
        void addOne(){
            number = 1;
            System.out.println(number);

        }
    }
}
