package com.jin.rose.Employee;

public abstract class EmployeeAbstract {


    private String name;
    private int age;
    private int phoneNumber;

    private static int totalE = 0;


    EmployeeAbstract(String name, int age, int phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        totalE++;
    }

    public static int getTotal() {
        return totalE;
    }
    abstract int getSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
