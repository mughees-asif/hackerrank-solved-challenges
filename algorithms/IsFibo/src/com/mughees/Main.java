package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        long numToCheck;
        for (int i = 0; i < testCases; i++) {
            numToCheck = scanner.nextLong();
            long[] fibonacci = fibonacciArray(numToCheck);
            Arrays.sort(fibonacci);
            long flag = Arrays.binarySearch(fibonacci, numToCheck);
            if(flag > 1) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }
    }

    static long[] fibonacciArray(long input) {
        input++;
        if (input <= 1) {
            return new long[]{input};
        }
        long[] result = new long[(int) (input + 1)];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= input; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}
