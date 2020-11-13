package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"})));
        System.out.println(Arrays.toString(matchingStrings(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"})));
    }

    private static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> map = new HashMap<>();
        int[] result = new int[queries.length];
        for (String inputString : strings) {
            map.put(inputString, map.getOrDefault(inputString, 0) + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            String queryString = queries[i];
            if (map.containsKey(queryString)) {
                result[i] = map.get(queryString);
            }
        }
        return result;
    }
}
