package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + s2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
