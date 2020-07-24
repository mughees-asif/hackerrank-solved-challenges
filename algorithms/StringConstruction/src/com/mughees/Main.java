package com.mughees;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(stringConstruction("abc"));
        System.out.println(stringConstruction("abab"));
        System.out.println(stringConstruction("abcd"));
    }

    static int stringConstruction(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for(char value : arr) {
            hashSet.add(value);
        }
        return hashSet.size();
    }
}
