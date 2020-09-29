package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int sizeOfArrays = scanner.nextInt();
        int targetToFind = scanner.nextInt();
        int[] arrayA = new int[sizeOfArrays];
        int[] arrayB = new int[sizeOfArrays];

        for (int i = 0; i < sizeOfArrays; i++) {
            arrayA[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayA));
        for (int i = 0; i < sizeOfArrays; i++) {
            arrayB[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayB));
        int pointer = 0;
        // rotate array
        for (int i = 0; i < sizeOfArrays; i++) {
            if (arrayA[i] + arrayB[pointer] >= targetToFind) {
                swap(arrayB, arrayB[pointer], arrayB[i]);
                System.out.println("Yes");
            } else {
                pointer++;
                System.out.println("No");
            }
        }
        System.out.println("arrayA = " + Arrays.toString(arrayA) + ", arrayB = " + Arrays.toString(arrayB));
    }

    static void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}
