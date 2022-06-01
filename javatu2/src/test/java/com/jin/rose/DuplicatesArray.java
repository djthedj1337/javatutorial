package com.jin.rose;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicatesArray {
    public static void main(String[] args) {
        int[] duplicates = {4, 1, 2, 1, 2};
        List<Integer> unique  = new ArrayList<>();


        for (int duplicate : duplicates) {
            if(unique.contains(duplicate)){
                unique.remove((Integer) duplicate);
            }else{
                unique.add(duplicate);
            }
        }


        System.out.println(unique.size());
        System.out.println(unique.toString());


    }
}


