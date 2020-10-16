package com.mughees;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    int[] array = {1,1,2};
        System.out.println(lonelyinteger(array));
    }

    static int lonelyinteger(int[] a) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int value : a) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                value = entry.getKey();
            }
        }
        return value;
    }
}
