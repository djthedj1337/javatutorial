package com.jin.rose.exercise5;

/*
 * With a given int[], such as {1, 0, 5, 4, -1, 6, -11, -3, 8, -3}
 * Find all tuples with 3 elements (a sub set of the array) so that the sum of the tuple is 0 ( 0 is not necessary. it can be any given number)
 *
 * For example: {1, 0, -1} {6, -3, -3}  {5, 6, -11}...

 */

public class Tuples2 {

    public static void getSumTuples(int[] a, int sum) {

        int f = 0;
        int s = 1;
        int t = 2;
        while(f != a.length - 2) {
            if (a[f] + a[s] + a[t] == sum) {
                System.out.println("{" + a[f] + "," + a[s] + ", " + a[t] + "}");
                t++;
            }
            if (s == a.length - 2) {
                f++;
                s = f + 1;
                t = s + 1;
                continue;
            }

            if (t == a.length - 1) {
                s++;
                t = s + 1;
                continue;
            }
            t++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 4, -1, 6, -11, -3, 8, -3};

        getSumTuples(arr, 10);
    }
}

