package com.jin.rose;

import java.sql.Array;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args){
        ArrayList<String> georgeL = new ArrayList<>();
        georgeL.add("Java");
        georgeL.add("C++");

        ArrayList<String> krishnanL = new ArrayList<>();
        krishnanL.add("Go");
        krishnanL.add("JavaScript");

        //Abstraction
        QAEngineer david = new QAEngineer("David", 25,1112223333,1, "Windows");
        SoftwareEngineer george = new SoftwareEngineer("george", 62,1112224444, 3, georgeL);
        SoftwareEngineer krishnan = new SoftwareEngineer("krishnan", 25,1112225555, 2, krishnanL);


        //Polymorphism
        //local variable
        ArrayList<EmployeeAbstract> list = new ArrayList<>();
        list.add(george);
        list.add(david);
        list.add(krishnan);

        //local variable
        int totalSalary = 0;
        int countE = 0;

        for (EmployeeAbstract employee : list) {
            countE++;
            //polymorphism
            totalSalary += employee.getSalary();
        }

        System.out.println("Total payment for " + countE + " workers = $" + totalSalary);
        System.out.println("Total number of employees: " +countE);
        System.out.println("Checking total number of employees:" + EmployeeAbstract.getTotal());



    }
}
