package com.jin.rose.exercise7;

/*
Given a function called f(int n), where:
f(0) = 1;
f(1) = 3;
f(n) = 2*f(n-1) + 3*f(n-2)

Implement the function in two ways: 1. Most efficient and 2. Most readable
 */

public class Factorial {

    //readability, large overhead, slower
    public static int recursiveF(int n) {
        if (n == 0) {
            return 1;
        }else if (n == 1) {
            return 3;
        }else {
            return 2 * recursiveF(n - 1) + 3 * recursiveF(n - 2);
        }
    }

    //not as readable but lower overhead, faster
    public static int iterativeF(int n) {

        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 3;

        }else {
            int firstSum = 3;
            int secondSum = 1;
            int iterativeSum = 0;
            while (n > 1) {
                iterativeSum = 2*firstSum + 3*secondSum;
                secondSum = firstSum;
                firstSum = iterativeSum;
                n --;
            }
            return iterativeSum;
        }
    }

    public static void main(String[] args){
        int test = 3;
        int test2 = 5;

        System.out.println(recursiveF(test));
        System.out.println(recursiveF(test2));


        System.out.println(iterativeF(test));
        System.out.println(iterativeF(test2));

    }
}
