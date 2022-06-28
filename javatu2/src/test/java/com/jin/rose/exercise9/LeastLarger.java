package com.jin.rose.exercise9;

/*
Given an array of numbers and an index, return either the index of the smallest number that is larger than the element at the given index,
or -1 if there is no such index (or, where applicable, nothing or a similarly empty value)

Notes:
Multiple correct answers may be possible. In this case return any one of them.
The given index will be inside the given array.
The given array will never be empty.

Assuming no negative numbers??
 */

public class LeastLarger {
    public static int findLeastLarger(int[] nums, int index){
        if(nums == null){
            throw new IllegalArgumentException("Input must be non-null");
        }

        int resIndex = -1;
        int resNum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > nums[index] && nums[i] < resNum){
                resIndex = i;
                resNum = nums[i];
            }
        }

        return resIndex;


    }

    public static void main(String[] args){
        int[] test = {4,1,3,5,6};
        System.out.println(findLeastLarger(test, 0));
        System.out.println(findLeastLarger(test,4));
    }
}
