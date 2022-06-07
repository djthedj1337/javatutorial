package com.jin.rose.exercise5;

import java.util.HashMap;
import java.util.Map;

/*
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are
* adjacent, with the colors in the order red, white and blue.
*
* Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
*
* Note: You are not supposed to use the library's sort function for this problem.
*
* Example:
*
* Input: [2,0,2,1,1,0]
* Output: [0,0,1,1,2,2]
* Follow up:
*
* A rather straight forward solution is a two-pass algorithm using counting sort.
* First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then
* 1's and followed by 2's.
* Could you come up with a one-pass algorithm using only constant space?
*/



public class Anagram {

    public static Map<Character, Integer> getChCount(String s) {

        Map<Character, Integer> chCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!chCount.containsKey(s.charAt(i))) {
                chCount.put(s.charAt(i), 1);
            } else {
                chCount.replace(s.charAt(i), chCount.get(s.charAt(i)) + 1);
            }

        }
        System.out.println(chCount);
        return chCount;
    }

    public static boolean isAnagram(String s1, String s2){

        if(s1 == null || s2 == null){
            System.out.println(s1 + " IS NOT an anagram of " + s2);
            return false;
        }

        if(s1.length() != s2.length()){
            System.out.println(s1 + " IS NOT an anagram of " + s2);
            return false;
        }

        if(getChCount(s1).equals(getChCount(s2))){
            System.out.println(s1 + " IS an anagram of " + s2);
            return true;
        }else {
            System.out.println(s1 + " IS NOT an anagram of " + s2);
            return false;
        }
    }
    public static void main(String[] args){
        String test1 = "hello";
        String test2 = "hello";

        isAnagram(test1,test2);


    }
}
