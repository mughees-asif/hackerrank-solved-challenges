package com.mughees;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3,6,80));
    }

    static int howManyGames(int p, int d, int m, int s) {
        int price = p;
        int result = 0;
        while (s >= price) {
            s -= price;
            result++;
            price = Math.max(m, price - d);
        }
        return result;
    }
}