package com.jin.rose.exercise5;

import java.util.Arrays;

/*

 * to check whether two strings are anagrams or not, string is assumed to consist of alphabets.
 * Two words are said to be anagrams of each other if the letters from one word can be rearranged to
 * form the other word.
 *
*/


public class RedWhiteBlue {

    public static void main(String[] args) {
        int[] rwb = {2, 0, 2, 1, 1, 0};
        int r = 0;
        int w = 0;
        int b = 0;

        for(int color : rwb){
            if (color == 0){
                r ++;
            }else if(color == 1){
                w ++;
            }else{
                b ++;
            }
        }
        for(int i = 0; i < rwb.length; i ++){
            if (i < r ){
                rwb[i] = 0;
            }else if (i < r + w){
                rwb[i] = 1;
            }else{
                rwb[i] = 2;
            }
        }
        System.out.println(Arrays.toString(rwb));

    }
}

