package com.mughees;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        sockMerchant(9, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3});
    }

    public static int sockMerchant(int n, int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int pairs = 0;
        for (int value : arr) {
            if (!hashSet.add(value)) {
                hashSet.remove(value);
                pairs++;
            }
        }
        return pairs;
    }
}
