package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        int input = scanner.nextInt();
        int[] inputArray = new int[input];
        for(int i = 0; i < input; i++) {
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = i; j < inputArray.length; j++) {
                sum += inputArray[j];
                if(sum < 0)     count++;
            }
        }
        System.out.println(count);
    }
}
