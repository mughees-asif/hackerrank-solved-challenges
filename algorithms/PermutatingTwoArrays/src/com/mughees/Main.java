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
            if (arrayA[pointer] + arrayB[i] >= targetToFind) {
                arrayB[pointer] = arrayB[i];
                pointer++;
                System.out.println("Yes");
            } else {
                arrayB[i] = arrayB[pointer];
                System.out.println("No");
            }
        }
        System.out.println("arrayA = " + Arrays.toString(arrayA) + ", arrayB = " + Arrays.toString(arrayB));

    }
}
