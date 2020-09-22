package com.mughees;
import java.util.Scanner;

public class Main {

    static String solve(double n) {
        if(isPerfectSquare(5*n*n - 4) || isPerfectSquare(5*n*n + 4))
            return "IsFibo";
        else
            return "IsNotFibo";
    }

    static boolean isPerfectSquare(double x){
        double sqr = Math.sqrt(x);
        return (sqr == Math.floor(sqr));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();

        while(t-- > 0){
            double n = scanner.nextDouble();
            System.out.println(solve(n));
        }

    }
}
