package com.mughees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            double n = scanner.nextDouble();
            System.out.println(solve(n));
        }
    }

    static String solve(double n) {
        // Ira Gessels method to check if a number is 
        if (isPerfectSquare(5 * n * n - 4) || isPerfectSquare(5 * n * n + 4))
            return "IsFibo";
        else
            return "IsNotFibo";
    }

    static boolean isPerfectSquare(double x) {
        double sqr = Math.sqrt(x);
        return (sqr == Math.floor(sqr));
    }
}
