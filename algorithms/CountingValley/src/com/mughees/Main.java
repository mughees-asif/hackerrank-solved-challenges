package com.mughees;

public class Main {

    public static void main(String[] args) {
        // test case
        countingValleys(9, "DDUUDDUDUUUD");
    }

    public static int countingValleys(int n, String s) {
        int height = 0;
        int counter = 0;
        char[] string = s.toCharArray();
        for (char c : string) {
            if (c == 'U') {
                if (height == -1) {
                    counter++;
                }
                height++;
            } else {
                height--;
            }
        }
        return counter;
    }
}
