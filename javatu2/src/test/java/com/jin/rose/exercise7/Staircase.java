package com.jin.rose.exercise7;
/*
You are traversing a staircase which takes n steps to get to the top. As you climb, you can either take 1 or 2 steps.

How many distinct ways could you climb to the top?

n = 1x + 2y;


if n = 7
start 7 = 1 (return 1, stay)
start 6 = 1 (return 1, 1)
start 5 = 2 (1,1; 2)
start 4 = 3 (1,2, 2,1; 1,1,1 )
start 3 = 5 (1,1,1,1, ; 2,1,1 ; 1,2,1 ; 2,2; 1,1,2 ) (common of 2,1 and 1,2 and 1,1,1)
start 2 = 8
start 1 = 13
start 0 = 21

two previous ones except for top two steps

 */

public class Staircase {

    public static int traverseStair(int n) {
        int step = 0;
        int twoPrev = 0;
        int onePrev = 1;
        int distinctWays = 0;

        while (step < n) {
            distinctWays = onePrev + twoPrev;
            twoPrev = onePrev;
            onePrev = distinctWays;
            step++;
        }

        return distinctWays;
    }

    public static void main(String[] args){
        System.out.println(traverseStair(7));
    }
}
