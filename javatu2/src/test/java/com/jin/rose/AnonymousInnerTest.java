package com.jin.rose;

public class AnonymousInnerTest {
    public static void main(String[] args){
        // creating anonymous inner class
        AnonymousInner inner = new AnonymousInner() {
            // once abstract class is called, it is declared AND instantiated at the same time, allows you to create a class autofilled,
            @Override
            public void myAnonMethod() {
                System.out.println("Anonymous Inner Class declared and instantiated.");
            }
        };
        inner.myAnonMethod();

    }
}

