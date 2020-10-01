package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfToys = scanner.nextInt();
        int moneyToSpend = scanner.nextInt();
        int[] toyPrices = new int[numOfToys];
        for (int i = 0; i < toyPrices.length; i++) {
            toyPrices[i] = scanner.nextInt();
        }
        Arrays.sort(toyPrices);

        int firstPointer = 0;
        int secondPointer = 1;
        int max = 1;
        int sum = toyPrices[firstPointer];

        if (sum >= moneyToSpend) {
            System.out.println("0");
        } else {
            for (int i = 0; i < toyPrices.length; i++) {
                sum += toyPrices[secondPointer];
                if (sum <= moneyToSpend) {
                    secondPointer++;
                    max++;
                }
            }
        }
        System.out.println(max);
    }
}

