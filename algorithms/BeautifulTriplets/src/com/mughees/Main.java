package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5};
        System.out.println(beautifulTriplets(1, arr));
    }

    static int beautifulTriplets(int d, int[] arr) {
        int beautifulTriplets = 0;
        for (int value : arr) {
            if (Arrays.binarySearch(arr, value + d) >= 0 &&
                    Arrays.binarySearch(arr, value + d * 2) >= 0) {
                ++beautifulTriplets;
            }2
        }
        return beautifulTriplets;
    }
}
