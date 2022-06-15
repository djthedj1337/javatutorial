package com.jin.rose.exercise8;
/*
Input: s = "aababbb"

totalFreq :  4bs, 3as

aaabbbb

aaa

- nested for loop that compares overall frequencies
- compare substring frequencies


Output: 3

babbb = 3 , 4 "b" - 1 "a"
a
aab
aaba
abbab





Input: s = "abcde"
 */

import java.util.*;

public class LargestVariance {
    public static int largestVariance(String s) {
        HashMap<Character, Integer> chCount = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!chCount.containsKey(s.charAt(i))) {
                chCount.put(s.charAt(i), 1);
            } else {
                chCount.replace(s.charAt(i), chCount.get(s.charAt(i)) + 1);
            }
        }

        int variance = 0;

        for (Character primaryCh : chCount.keySet()) {
            for (Character secondaryCh : chCount.keySet()) {
                if (primaryCh == secondaryCh) {
                    continue;
                }
                //overall string freq for pointer
                int secondaryChCount = chCount.get(secondaryCh);
                //substring Freq
                int primaryChFreq = 0;
                int secondaryChFreq = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == primaryCh) {
                        primaryChFreq++;
                    }
                    if (s.charAt(i) == secondaryCh) {
                        secondaryChFreq++;
                        secondaryChCount--;
                    }
                    if (primaryChFreq > 0 && secondaryChFreq > 0 && primaryChFreq > secondaryChFreq) {
                        //compared variance to current
                        variance = Math.max(variance, primaryChFreq - secondaryChFreq);
                    }
                    if (secondaryCh > 0 && secondaryChFreq > primaryChFreq) {
                        primaryChFreq = 0;
                        secondaryChFreq = 0;

                    }
                }
            }
        }
        return variance;
    }

    public static int largestVariance2(String s){
        HashMap<Character, Integer> chCount = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!chCount.containsKey(s.charAt(i))) {
                chCount.put(s.charAt(i), 1);
            } else {
                chCount.replace(s.charAt(i), chCount.get(s.charAt(i)) + 1);
            }
        }
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for (Character current : chCount.keySet()){
            int currFreq = chCount.get(current);

            if(currFreq > maxFreq){
                maxFreq = currFreq;

            }else if(currFreq < minFreq){
                minFreq = currFreq;
            }
        }


        int variance = 0;
        return variance;


    }

    public static int findStringVariance(String s){
        Map<Character,Integer> chCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!chCount.containsKey(current)){
                chCount.put(current, 1);
            }else {
                chCount.replace(current, chCount.get(current) + 1);
            }
        }
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for(Character curr: chCount.keySet()){
            int currChFreq = chCount.get(curr);
            if(currChFreq > maxFreq){
                maxFreq = currChFreq;
            }
            if(currChFreq < minFreq){
                minFreq = currChFreq;
            }
        }



        return maxFreq - minFreq;
    }

    public static Set<String> findAllSubstrings(String s){
        Set<String> allSubStrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                allSubStrings.add(s.substring(i, j));
            }
        }
        return allSubStrings;
    }

    public static int largestVariance3(String s){
        Set<String> allSubStrings = findAllSubstrings(s);
        int variance = 0;

        for(String substring : allSubStrings){
            int currVariance = findStringVariance(substring);
            if (currVariance > variance){
                variance = currVariance;
            }
        }

        return variance;
    }

    public static void main(String[] args){
        String s = "aababbb";
        //System.out.println(largestVariance3(s));
        System.out.println(findStringVariance(s));
    }
}
