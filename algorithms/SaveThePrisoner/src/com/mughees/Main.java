package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5,2,2));
    }

    static int saveThePrisoner(int n, int s, int m) {
        int unluckyPrisoner = (s + (m - 1)) % n;
        return (unluckyPrisoner == 0) ? n : unluckyPrisoner;
    }
}
