package com.jin.rose;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigits2 {
    public static boolean isUnique(int x) {
        Set<Integer> digitSet = new HashSet<>();

        while (x > 0) {
            // === x the return
            if(!digitSet.add(x % 10)){
                return false;
            };
            digitSet.add(x%10);
            x = x / 10;
        }

        return digitSet.size() == 5 || (digitSet.size() == 4 && !digitSet.contains(0));
    }

    public static Set<Integer> findAllUnique5Digits() {
        Set<Integer> unique = new HashSet<>();
        for (int i = 1; i < 100000; i++) {
            if (isUnique(i)) {
                unique.add(i);
            }
        }
        return unique;
    }
    public static void main(String[] args){
        System.out.println(findAllUnique5Digits().size());
    }

}
