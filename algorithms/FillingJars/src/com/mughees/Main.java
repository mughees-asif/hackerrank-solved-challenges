package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long N = reader.nextInt();
        long M = reader.nextInt();
        long total = 0;
        for (int i = 0; i < M; i++) {
            long a = reader.nextInt();
            long b = reader.nextInt();
            long k = reader.nextInt();
            total = total + (b - a + 1) * k;
        }
        long avg = (long) Math.floor(total / N);
        System.out.println(avg);
    }
}
