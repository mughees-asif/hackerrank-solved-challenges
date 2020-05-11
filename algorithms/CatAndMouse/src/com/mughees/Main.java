package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }

    public static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);
        return catA > catB ? "Cat B" : (catA < catB ? "Cat A" : "Mouse C");
    }
}
