package com.jin.rose;

public class StaticNested {
    static class StaticInner{
        void innerMethod(){
            System.out.println("This requires no reference to outer class/doesn't need outerclass to be instantiated");
        }
    }
}
