package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10));
    }

    static long repeatedString(String s, long n) {
        final long quotient = n / s.length(), remainder = n % s.length();
        long counter = 0;

        if ((s.length() == 1) && (s.charAt(0) == 'a')) {
            return n;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        counter *= quotient;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
