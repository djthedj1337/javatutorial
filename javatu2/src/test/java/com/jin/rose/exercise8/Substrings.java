package com.jin.rose.exercise8;

import java.util.HashSet;
import java.util.Set;

public class Substrings {
    public static Set<String> getAllSubStrings(String s) {
        Set<String> allSubStrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                allSubStrings.add(s.substring(i, j));
            }
        }
        return allSubStrings;
    }

    public static void main(String[] args) {
        String test = "aababbb";
        System.out.println(getAllSubStrings(test));
    }

}
