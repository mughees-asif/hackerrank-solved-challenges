package com.mughees;

public class Main {

    public static void main(String[] args) {
        // test case
        pageCount(6, 2);
    }

    static int pageCount(int n, int p) {
        int min = Math.min(p / 2, (n / 2) - (p / 2));
        return min;
    }
}
