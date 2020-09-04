package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthA = scanner.nextInt();
        int lengthB = scanner.nextInt();
        int lengthC = scanner.nextInt();

        int[] arrA = createArr(lengthA);
        int[] arrB = createArr(lengthB);
        int[] arrC = createArr(lengthC);

        System.out.println(tripleSum(arrA, arrB, arrC));
    }

    static int[] createArr(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    static long tripleSum(int[] arrA, int[] arrB, int[] arrC) {
        int[] sortedArrA = getUniqueElements(arrA);
        int[] sortedArrB = getUniqueElements(arrB);
        int[] sortedArrC = getUniqueElements(arrC);

        long result = 0;
        for (int value : sortedArrB) {
            result += (long) findUniqueElements(sortedArrA, value) * findUniqueElements(sortedArrC, value);
        }
        return result;
    }

    static int[] getUniqueElements(int[] arr) {
        return Arrays.stream(arr).distinct().sorted().toArray();
    }

    static int findUniqueElements(int[] arr, int num) {
        int index = Arrays.binarySearch(arr, num);
        if (index < 0) {
            index = -1 - index - 1;
        }
        return index + 1;
    }
}
