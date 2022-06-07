package com.jin.rose.exercise5;

/*
 * With a given int[], such as {1, 0, 5, 4, -1, 6, -11, -3, 8, -3}
 * Find all tuples with 3 elements (a sub set of the array) so that the sum of the tuple is 0 ( 0 is not necessary. it can be any given number)
 *
 * For example: {1, 0, -1} {6, -3, -3}  {5, 6, -11}...

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Tuples {

    public static class Triplet {
        private int a;
        private int b;
        private int c;

        public Triplet(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public String toString(){
            return "{" + a + ", " + b + ", " + c + "}";
        }
    }


    public static List<Triplet> getSumTuples(int[] a, int sum) {
        List<Triplet> allTuples = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        Triplet tuple = new Triplet(a[i], a[j], a[k]);
                        allTuples.add(tuple);
                    }
                }
            }
        }
        return allTuples;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 4, -1, 6, -11, -3, 8, -3};

        System.out.print(getSumTuples(arr, 5));
    }
}
