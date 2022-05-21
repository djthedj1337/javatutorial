package com.jin.rose;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack sodas = new Stack();



        System.out.println(sodas.isEmpty());
        sodas.push(3);
        sodas.push(4);
        System.out.println(sodas.isEmpty());
        System.out.println(sodas.size());

        System.out.println(sodas.peek());
        System.out.println(sodas.size());

        System.out.println(sodas.pop());
        System.out.println(sodas.size());





    }
}
