package com.mughees;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 44, 53, 31, 27, 77, 60, 66, 77, 26, 36 };
        birthdayCakeCandles(arr);
    }

    static int birthdayCakeCandles (int[] ar) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == max) {
                count++;
            }
        }
        return count;
    }
}
