package com.jin.rose;

public class StaticVNonStaticInnerTest {
    public static void main(String[] args){
        System.out.println("Static Nested Class");
        StaticNested.StaticInner static1 = new StaticNested.StaticInner();
        static1.innerMethod();
        System.out.println("");
        //Below does not work, as nonstatic must be instantaited before inner can be called
        //NonStaticNested.NonStaticInner nonstatic1 = new NonStaticNested.NonStaticInner();
        System.out.println("NonStatic Nested Class");
        NonStaticNested nonstatic1 = new NonStaticNested();
        NonStaticNested.NonStaticInner nonstatic2 = nonstatic1.new NonStaticInner();
        nonstatic2.innerMethod();




    }
}
