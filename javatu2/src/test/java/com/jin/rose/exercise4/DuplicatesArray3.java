package com.jin.rose.exercise4;

public class DuplicatesArray3 {
    public static void main(String[] args) {
        int[] duplicates = {21, 4, 1, 10, 2, 1, 2, 4, 10, 8, 5, 8, 99, 20, 7, 7, 5, 20, 21};
        int nonDup = 0;
        for (int duplicate : duplicates) {
            nonDup = nonDup ^ duplicate;
        }
        System.out.println("The non-duplicate is " + nonDup);
    }
}
