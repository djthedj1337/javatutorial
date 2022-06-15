package com.jin.rose.exercise8;
/*
Given a m*n array filled with non-negative numbers, find a path from top left to bottom right which
maximize the sum of all numbers along its path.

Note: You can only move eirther down or right at any point in time.

EXAMPLE
Input:
{ [1,3,1,2],
  [1,5,1,3],
  [4,2,1,3]
}
Output: 16
Explanation Path 1 --> 3 --> 5 --> 1 --> 3 --> 3 is the path with the maximum sum

List of coordinates:
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathMaxSum {
    public static int findPathMaxSum(int[][] path){

        int row = path.length;
        int column = path[0].length;
        int[][] sum = new int[row][column];

        Pair[][] maxPath = new Pair[row][column];
        maxPath[0][0] = null;

        sum[0][0] = path[0][0];

        //first column
        for(int i = 1; i < row; i++){
            sum[i][0] = sum[i-1][0] + path[i][0];
            maxPath[i][0] = new Pair(i-1,0);
        }
        //first row
        for(int j = 1; j < column; j++){
            sum[0][j] = sum[0][j-1] + path[0][j];
            maxPath[0][j] = new Pair(0,j-1);

        }



        for(int r = 1; r < row; r++) {
            for (int c = 1; c < column; c++) {
                sum[r][c] = path[r][c] + Math.max(sum[r - 1][c], sum[r][c - 1]);

                if(sum[r-1][c] > sum[r][c-1]){
                    maxPath[r][c] = new Pair(r-1,c);
                }else{
                    maxPath[r][c] = new Pair(r,c-1);
                }
            }
        }

        List<Pair> result = new ArrayList<>();
        int r = row - 1;
        int c = column -1;
        result.add(new Pair(r,c));

        while (maxPath[r][c] != null) {
            result.add(0, maxPath[r][c]);
            int t = maxPath[r][c].a;
            c = maxPath[r][c].b;
            r =t;
        }

        System.out.println(result);

        return sum[row-1][column-1];
    }

    public static void main(String[] args) {
        int[][] test = {{1, 3, 1, 2},
                        {1, 5, 1, 3},
                        {4, 2, 1, 3}};
        System.out.println(findPathMaxSum(test));

    }

}
