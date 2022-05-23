package com.jin.rose;

public class StaticInnerAccessTest {
    public static void main(String[] args){
        StaticOuterAccess test = new StaticOuterAccess();
        StaticOuterAccess.StaticInnerAccess test2 = new StaticOuterAccess.StaticInnerAccess();

        test.addTwo();
        test2.addOne();


    }
}
