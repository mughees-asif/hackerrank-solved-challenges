package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = scanner.nextInt();
        }

        int energyLevel = 100;
        int cloud = 0;
        do {
            energyLevel--;       // performed a jump
            cloud = (cloud + k) % n;
            if (c[cloud] == 1) {
                energyLevel -= 2;     // landed on a thundercloud
            }
        } while (cloud != 0);
        System.out.println(energyLevel);
    }
}