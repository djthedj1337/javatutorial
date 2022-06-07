package com.jin.rose.exercise5;

import java.util.Arrays;

/*

 * to check whether two strings are anagrams or not, string is assumed to consist of alphabets.
 * Two words are said to be anagrams of each other if the letters from one word can be rearranged to
 * form the other word.
 *
 */

public class RedWhiteBlue2 {

    public static void swap(int[] arr, int a, int b){
        int hold;
        hold = arr[a];
        arr[a] = arr[b];
        arr[b] = hold;
    }

    public static void main(String[] args) {
        int[] rwb = {2, 1, 0, 2, 1, 0};

        //pointer of end of 0s
        int r = 0;

        //pointer at beginning of 1s
        int w = r+1;

        //pointer of beginning 2s
        int b = rwb.length -1;
        //hold element


        for (int i = 0; i < rwb.length; i++) {
            if (rwb[i] == 0) {
                swap(rwb, r, i);
                r ++;
                continue;
            }
            if (rwb[i] == 1) {
                swap(rwb, w,i);
                w = r+1;
                continue;

            }
            if(rwb[i] == 2 && i <b){
                swap(rwb, i ,b);
                b --;
                continue;
            }

        }

        System.out.println(Arrays.toString(rwb));
    }

}
