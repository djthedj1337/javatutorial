package com.jin.rose;

//Polymorphism, IS-A + Abstraction, Inheritance
public class QAEngineer extends EmployeeAbstract{

    //Encapsulation

    //instance
    private int level;
    //instance variable
    private String oS;
    //class variable
    private static int baseRate = 40;

    public QAEngineer(String name, int age, int phoneNumber, int level , String os) {
        super(name, age, phoneNumber);
        this.level = level;
        this.oS = oS;

    }
    //Overriding
    //instance
    public int getSalary() {
        return baseRate*level;
    }

    //instance
    public int getLevel() {
        return level;
    }

    //instance
    public void setLevel(int level) {
        this.level = level;
    }

    //instance
    public String getoS() {
        return oS;
    }

    //instance
    public void setoS(String oS) {
        this.oS = oS;
    }

    //class
    public static int getBaseRate() {
        return baseRate;
    }

    //class
    public static void setBaseRate(int baseRate) {
        QAEngineer.baseRate = baseRate;
    }
}

