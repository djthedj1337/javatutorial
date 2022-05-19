package com.jin.rose;

public class SubExample extends SuperExample {

    public SubExample(){};

    public SubExample(int num){
        super(num);
    }

    public void info() {
        System.out.println("Sub class method activated.");
    }
    public void displayBoth() {
        //Create object of subclass in order to call method
        SubExample sub = new SubExample();
        sub.info();

        //call method of super class
        super.info();
    }

    public void move(){
        System.out.println("This is the subclass method that overrides the superclass method.");
    }

    public void sub(){
        System.out.println("This is a subclass exclusive method that requires a direct reference to subclass instead of reference to the superclass.");
    }
}
