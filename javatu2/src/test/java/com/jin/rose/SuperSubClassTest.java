package com.jin.rose;

public class SuperSubClassTest {
    public static void main(String[] args){
        SubExample subTest = new SubExample();
        SubExample subTest2 = new SubExample(20);

        subTest.info();
        subTest.displayBoth();


        SuperExample a = new SuperExample();
        //Overriding method
        SuperExample b = new SubExample(); //reference to superclass as a subclass object
        SubExample c = new SubExample(); //reference to subclass as a subclass object
        System.out.println("\n");

        a.move();
        //Below will showcase sub method of move
        b.move();
        //b.sub() will result in a compiling error
        c.move();
        //below reuires direct reference to subclass which it does, otherwise it will not work i.e. b.sub()
        c.sub();

    }
}
