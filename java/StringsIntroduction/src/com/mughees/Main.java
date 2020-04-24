package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        int countA = A.length();
        int countB = B.length();

        // number of string elements
        System.out.println(countA + countB);

        // store strings in an array
        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();
        // check to see if A > B
        System.out.println(arr1[0] <= arr2[0] ? "No" : "Yes");

        // capitalise only the first letter of each word
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)
                + " " +
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
