package com.jin.rose;

public class NonStaticNested {
    class NonStaticInner{
        void innerMethod(){
            System.out.println("This does require a reference/instantiation of outer class");
        }
    }
}
