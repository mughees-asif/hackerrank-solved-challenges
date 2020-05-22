package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }

    static int utopianTree(int n) {
        if (n % 2 == 0) {
            return (int) (Math.pow(2, n / 2) * 2) - 1;
        } else {
            return (int) ((Math.pow(2, n / 2) * 2) - 1) * 2;
        }
    }
}
