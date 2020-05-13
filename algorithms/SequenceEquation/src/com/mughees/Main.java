package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4};
        System.out.println(Arrays.toString(permutationEquation(arr)));
    }

    public static int[] permutationEquation(int[] p) {
        int length = p.length;
        int count = 0;
        int[] result = new int[length];
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                if (p[j] == i) {
                    count = j + 1;
                    break;
                }
            }
            for (int j = 0; j < length; j++) {
                if (p[j] == count) {
                    count = j + 1;
                    break;
                }
            }
            result[i - 1] = count;
        }
        return result;
    }
}
