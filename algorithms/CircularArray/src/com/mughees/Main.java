package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {3,4,5};
        int[] query = {1,2};
        System.out.println(Arrays.toString(circularArrayRotation(test, 2, query)));
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k %= a.length;
        int[] result = new int[queries.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[(queries[i] - k + a.length) % a.length];
        }
        return result;
    }
}
