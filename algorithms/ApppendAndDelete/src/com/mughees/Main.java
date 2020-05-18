package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        System.out.println(solve(s, t, k));
    }

    private static String solve(String s, String t, int k) {
        // common prefix length
        int j = 0;
        for (int i = 0; i < Math.min(t.length(), s.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            } else {
                j++;
            }
        }

        if ((s.length() + t.length() - 2 * j) > k) {
            // s = xxxabc
            // t = xxxhklmn
            // k = 2
            return "No";
        }

        if ((s.length() + t.length() - 2 * j) % 2 == k % 2) {
            // For every non-matching char in s, delete it and add a char from t (2 operations - delete, add).
            // Any remaining operations can be done at the beginning as delete operations for matching chars as well.
            return "Yes";
        }

        if (s.length() + t.length() < k) {
            // We have enough operations left to delete the entire string s and append t.length characters
            return "Yes";
        }
        return "No";
    }
}
