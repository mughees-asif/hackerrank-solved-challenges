package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthA = scanner.nextInt();
        int lengthB = scanner.nextInt();
        int lengthC = scanner.nextInt();

        int[] arrA = new int[lengthA];
        int[] arrB = new int[lengthB];
        int[] arrC = new int[lengthC];

        for(int i = 0; i < lengthA; i++) {
            arrA[i] = scanner.nextInt();
        }
        for(int i = 0; i < lengthB; i++) {
            arrB[i] = scanner.nextInt();
        }
        for(int i = 0; i < lengthC; i++) {
            arrC[i] = scanner.nextInt();
        }
    }
}
