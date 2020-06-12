package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] sortedArray;
        int[] result = new int[t];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < t; i++) {
            int firstRangeNumber = scanner.nextInt();
            int secondRangeNumber = scanner.nextInt();
            sortedArray = Arrays.copyOfRange(arr, firstRangeNumber, secondRangeNumber + 1);
            Arrays.sort(sortedArray);
            result[i] = sortedArray[0];
        }
        scanner.close();
        for (int value : result) {
            System.out.println(value);
        }
    }
}
