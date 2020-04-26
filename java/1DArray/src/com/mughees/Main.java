package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        for (int value : a) {
            System.out.println(value);
        }
    }
}
