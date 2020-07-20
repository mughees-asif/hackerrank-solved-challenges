package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }

    static String pangrams(String s) {
        // given string
        s = s.toLowerCase().replaceAll("\\W", "");
        Set<Character> given = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            given.add(s.charAt(i));
        }

        // comparator string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> treeSet = new TreeSet<>();
        for (int i = 0; i < alphabet.length(); i++) {
            treeSet.add(alphabet.charAt(i));
        }

        return given.equals(treeSet) ? "pangram" : "not pangram";
    }
}
