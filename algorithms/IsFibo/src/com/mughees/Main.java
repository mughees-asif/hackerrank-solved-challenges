package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int numToCheck = 0;
        for (int i = 0; i < testCases; i++) {
            numToCheck = scanner.nextInt();

            int[] fibonacciArray = fibonacciArray(numToCheck);
            Arrays.sort(fibonacciArray);

            int flag = Arrays.binarySearch(fibonacciArray, numToCheck);
            if(flag > 1) {
                System.out.println("IsFibo");
            } else {
                System.out.println("IsNotFibo");
            }
        }
    }

    static int[] fibonacciArray(int input) {
        if (input <= 1) {
            return new int[]{input};
        }
        int[] result = new int[input + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= input; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

}
