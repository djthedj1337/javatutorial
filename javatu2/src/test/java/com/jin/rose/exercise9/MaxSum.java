package com.jin.rose.exercise9;
/*
Find the max sum of all contiguous sub arrays of an integer array

Intput:
int[] a = {1, -2, 3, -1, 2, 1}

Output:
5, from index 2 to 5


 */

public class MaxSum {
    //brute force, inefficient
    public static int findMaxSum(int[] a){
        int maxSum = Integer.MIN_VALUE;
        int bI = 0;
        int eI = 0;

        for(int i = 0; i < a.length; i ++){
            int currSum = 0;
            for(int j = i; j < a.length; j++){
                currSum += a[j];
                if(currSum > maxSum){
                    maxSum = currSum;
                    bI = i;
                    eI = j;
                }
            }
        }

        System.out.println("Beginning Index: " + bI + " and the End Index: " + eI);
        return maxSum;
    }

    //efficient, non brute force
    public static int findMaxSum2(int[] a) {
        int maxSum = Integer.MIN_VALUE;

        int currSum = 0;
        int bI = 0;
        int eI = 0;

        int currBI = 0;


        for (int i = 0; i < a.length; i++) {

            currSum += a[i];


            if (currSum > maxSum) {
                maxSum = currSum;
                eI = i;
                bI = currBI;
            }
            if (currSum < 0) {
                currSum = 0;
                currBI = i + 1;
            }

        }

        System.out.println("Beginning Index: " + bI + " and the End Index: " + eI);
        return maxSum;
    }



    public static void main(String[] args){
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        int[] test2 = {1,-2,3,-1,2,1};
        int[] test3 = {-1,-2,-3};

        //System.out.println(findMaxSum(test));
        System.out.println(findMaxSum(test2));
        System.out.println(findMaxSum(test3));



        //System.out.println(findMaxSum2(test));
        System.out.println(findMaxSum2(test2));
        System.out.println(findMaxSum(test3));




    }
}
