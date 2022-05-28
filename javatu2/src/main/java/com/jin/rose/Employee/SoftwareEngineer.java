package com.jin.rose.Employee;


import java.util.ArrayList;

public class SoftwareEngineer extends EmployeeAbstract {
    private int level;
    private ArrayList<String> languages = new ArrayList<>();
    private static int baseRate = 50;

    public SoftwareEngineer(String name, int age, int phoneNumber, int level, ArrayList<String> languages) {
      super(name, age, phoneNumber);
      this.level = level;
      this.languages = languages;
    }

    public int getSalary(){
        return baseRate*level;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public static int getBaseRate() {
        return baseRate;
    }

    public static void setBaseRate(int baseRate) {
        SoftwareEngineer.baseRate = baseRate;
    }



}
