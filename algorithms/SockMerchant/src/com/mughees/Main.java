package com.mughees;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        sockMerchant(9, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3});
    }

    public static void sockMerchant(int n, int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = hmap.get(arr[i]);
            if (hmap.get(arr[i]) == null) hmap.put(arr[i], 1);
            else hmap.put(arr[i], ++c);
        }
        for (Integer i : hmap.keySet()) {
            Integer cnt = hmap.get(i);
            if (cnt >= 1) {
                System.out.println(i + " -> " + cnt);
            }
            if (cnt % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
