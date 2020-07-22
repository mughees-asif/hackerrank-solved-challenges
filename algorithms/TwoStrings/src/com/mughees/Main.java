package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("a", "art"));
    }

    static String twoStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            return "YES";
        }
        int maxNumber = 26;
        boolean v[] = new boolean[maxNumber];
        Arrays.fill(v, false);
        for (int i = 0; i < s1.length(); i++) {
            v[s1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (v[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }
        return "NO";
    }
}
