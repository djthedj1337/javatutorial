package com.jin.rose.exercise9;
/*
find the number of paths from top left corner to the bottom left in
* a two dimensional matrix.
* The input: a two dimensional matrix, each element is either 1 or 0
* 0 means can not go over or stop point, 1 means a path can go through it
*
* a path can go either from left or from upper.
*
*/



public class MaxPaths {
    public static int findMaxPaths(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        for(int i = 1; i < column; i ++) {
            int obstacle = grid[0][i - 1];

            if (obstacle == 0) {
                grid[0][i] = 0;
            }
        }


        for (int i = 1; i < row; i ++) {
            int obstacle = grid[i-1][0];

            if (obstacle == 0)
                grid[i][0] = 0;
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                int above = grid[i - 1][j];
                int left = grid[i][j - 1];

                if (grid[i][j] == 0) {
                    continue;
                }

                if (above > 0 && left > 0) {
                    grid[i][j] = above + left;
                }else{
                    grid[i][j] = Math.max(above, left);
                }
            }
        }

        return grid[row - 1][column - 1];
    }


    public static void main(String[] args){
        int[][] test = {{1,1,0,1},{1,1,1,1},{0,1,0,1},{1,1,1,1}};
        int[][] test2 = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(findMaxPaths(test));
        System.out.println(findMaxPaths(test2));

    }
}
