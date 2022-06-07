package com.jin.rose.exercise5;

import java.util.Arrays;

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

public class Anagram2 {

    public static boolean isAnagram(String s1, String s2) {
        if(s1 == null || s2 == null){
            System.out.println(s1 + " IS NOT an anagram of " + s2);
            return false;
        }

        if(s1.length() != s2.length()){
            System.out.println(s1 + " IS NOT an anagram of " + s2);
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println(s1 + " IS NOT an anagram of " + s2);
                return false;
            }
        }

        System.out.println(s1 + " IS an anagram of " + s2);
        return true;
    }


    public static void main(String[] args){
        String test1 = "hello";
        String test2 = "lhelo";
        String test3 = "what";
        String test4 = "check";

        isAnagram(test1,test2);
        isAnagram(test2,test4);
        isAnagram(test3,test2);
    }
}
