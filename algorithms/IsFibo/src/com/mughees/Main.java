package com.mughees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            double numToCheck = scanner.nextDouble();
            System.out.println(solve(numToCheck));
        }
    }

    // 'n' is a Fibonacci number if and only if  (5 * n * n - 4 || 5 * n * n + 4)
    // is a perfect square.
    static String solve(double input) {
        if (isPerfectSquare(5 * input * input - 4) ||
                isPerfectSquare(5 * input * input + 4)) {
            return "IsFibo";
        } else {
            return "IsNotFibo";
        }
    }

    static boolean isPerfectSquare(double x) {
        double sqr = Math.sqrt(x);
        return (sqr == Math.floor(sqr));
    }
}
