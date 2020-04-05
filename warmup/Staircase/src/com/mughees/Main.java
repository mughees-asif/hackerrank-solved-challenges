package com.mughees;

public class Main {

    public static void main(String[] args) {
        staircase(6);
    }
    static void staircase(int n) {
        for(int i=n; i > 0; i--) {
            String s = "";
            for (int j = 1; j <= n - i + 1; j++) s += "#";
            System.out.printf("%" + n + "s\n", s);
        }
    }
}
