package com.mughees;

public class Main {

    public static void main(String[] args) {

    }

    static int flatlandSpaceStations(int n, int[] c) {
        int i = 0;
        int m = c.length;
        int max = 0;
        int diff = 90;
        int j, x;
        int temp = 1;

        for (i = 0; i < n; i++) {
            temp = 1;
            for (j = 0; j < m; j++) {
                if (c[j] == i) {
                    temp = 0;
                    break;
                }
            }

            if (temp != 0) {
                diff = Math.abs(c[0] - i);
                for (j = 1; j < m; j++) {
                    x = Math.abs(c[j] - i);
                    if (x < diff) {
                        diff = x;
                    }
                }
                if (diff > max)
                    max = diff;
            }
        }
        return max;
    }
}
