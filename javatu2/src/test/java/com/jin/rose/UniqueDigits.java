package com.jin.rose;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigits {
    public static boolean checkUnique(String s){
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j <s.length(); j++){
                if(ch[i] == ch[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        HashSet<String> unique = new HashSet<>();

        for(int i = 0; i <= 99999; i ++){
            String current = new String("test");
            if(i < 10){
                current = "0000" + i;
            }

            else if(i < 100){
                current = "000" + i;
            }

            else if(i < 1000) {
                current = "00" + i;
            }

            else if(i < 10000) {
                current = "0" + i;
            }else{
                current = "" + i;
            }

            if(checkUnique(current)){
                unique.add(current);

            }
        }

        System.out.println(unique);
        System.out.println(unique.size());

    }
}



