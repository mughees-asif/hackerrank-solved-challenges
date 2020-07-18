package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "hereiamstackerrank";
        String s2 = "hackerworld";
        String s3 = "hhaacckkekraraannk";
        String s4 = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";

        System.out.println(hackerrankInString(s));
        System.out.println(hackerrankInString(s2));
        System.out.println(hackerrankInString(s3));
        System.out.println(hackerrankInString(s4));

    }

    static String hackerrankInString(String s) {
        String name = "hackerrank";
        if(s.length() < name.length())  return "NO";
        int j = 0;
        for(int i = 0 ; i < s.length(); i++) {
            if(j < name.length() && s.charAt(i) == name.charAt(j)) {
                j++;
            }
        }
        return (j == name.length() ? "YES" : "NO");
    }
}
