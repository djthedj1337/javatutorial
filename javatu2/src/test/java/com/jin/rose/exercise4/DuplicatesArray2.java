package com.jin.rose.exercise4;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray2 {
    public static void main(String[] args) {
        int[] duplicates = {4, 1, 2, 1, 2};
        Set<Integer> unique = new HashSet<>();


        for (int duplicate : duplicates) {
            if(unique.contains(duplicate)){
                unique.remove(duplicate);
            }else{
                unique.add(duplicate);
            }
        }


        System.out.println(unique.toString());


    }
}