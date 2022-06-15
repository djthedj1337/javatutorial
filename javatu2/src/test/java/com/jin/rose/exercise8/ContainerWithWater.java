package com.jin.rose.exercise8;

public class ContainerWithWater {

    //brute force, n^2, time limit exceeded with large int[]
    public int maxArea(int[] height) {
        int currentArea = 0;
        int maxArea = 0;

        //every possible combination of heights, widths, and areas
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {

                int height1 = height[i];
                int height2 = height[j];
                int width = j - i;


                if (height1 > height2) {
                    currentArea = height2 * width;
                }else{
                    currentArea = height1 * width;
                }

                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }

            }
        }
        return maxArea;
    }

    //two pointer, meet in the middle, start with max width
    public int maxArea2(int[] height){
        int maxArea = 0;
        int b = 0;
        int e = height.length -1;

        while(b != e) {
            int width = e - b;
            if (height[b] < height[e]){
                maxArea = Math.max(maxArea, height[b] * width);
                b ++;
            }else{
                //this already accounts for equal heights and if height[e] < height[b]
                maxArea = Math.max(maxArea, height[e] * width);
                e --;
            }

        }
        return maxArea;
    }
}