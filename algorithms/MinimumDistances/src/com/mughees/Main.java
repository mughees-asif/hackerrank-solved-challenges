package com.mughees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 3};
        System.out.println(minimumDistances(array));
    }

    static int minimumDistances(int[] a) {
        int minDistance = Integer.MAX_VALUE;
        Map<Integer, Integer> value2lastIndex = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (value2lastIndex.containsKey(a[i])) {
                minDistance = Math.min(minDistance, i - value2lastIndex.get(a[i]));
            }
            value2lastIndex.put(a[i], i);
        }
        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }
}
