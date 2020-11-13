package com.mughees;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "ab", "xzxb"})));
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int counter = 0;
        int[] result = new int[queries.length];

        HashMap<String, Integer> map = new HashMap<>();
        for(String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);


        return result;
    }
}
