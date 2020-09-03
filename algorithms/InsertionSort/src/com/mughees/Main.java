package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int[] arr = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            arr[i] = scanner.nextInt();
        }

        int sort = arr[arr.length - 1];
        int i;
        for (i = arr.length - 2; (i >= 0) && (arr[i] > sort); i--) {
            arr[i + 1] = arr[i];
            printArray(arr);
        }
        arr[i + 1] = sort;
        printArray(arr);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
