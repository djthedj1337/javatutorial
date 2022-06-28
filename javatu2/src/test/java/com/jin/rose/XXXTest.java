package com.jin.rose;

import java.util.*;

public class XXXTest {
    public static int findMaxSum(int[][] matrix){
        int rowL = matrix[0].length;
        int colL = matrix.length;

        for(int i = 1; i < rowL; i ++){
            matrix[0][i] =+ matrix[0][i-1];
        }

        for(int j = 1; j < colL; j ++){
            matrix[j][0] =+ matrix[j-1][0];
        }

        for(int r = 1; r < rowL; r ++){
            for(int c = 1; c < colL; c++){
                int above = matrix[c][r-1];
                int left = matrix[c-1][r];

                matrix[c][r] += Math.max(above, left);
            }
        }

        return matrix[colL - 1][rowL - 1];
    }

    public static void main(String[] args){
        int[][] test = {{1, 3, 1, 2},
                {1, 5, 1, 3},
                {4, 2, 1, 3}};
        System.out.println(findMaxSum(test));
    }


}