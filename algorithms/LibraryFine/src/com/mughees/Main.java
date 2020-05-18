package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1014));
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if (y2 != y1) {
            for (int i = y2; i <= y1; i++) {
                fine = 10000 * (y1 - y2);
            }
        } else if (m2 != m1) {
            for (int i = m2; i <= m1; i++) {
                fine = 500 * (m1 - m2);
            }
        } else if (d2 != d1) {
            for (int i = d2; i <= d1; i++) {
                fine = 15 * (d1 - d2);
            }
        }
        return fine;
    }
}
