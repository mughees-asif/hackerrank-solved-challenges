package com.mughees;

public class Main {

    public static void main(String[] args) {
        int[] test = {13, 91, 56, -62, 96, -5, -84, -36, -46, -13};
        int[] test1 = {45, 67, 64, -50, -8, 78, 84, -51, 99, 60};
        int[] test2 = {26, 94, -95, 34, 67, -97, 17, 52, 1, 86};
        int[] test3 = {19, 29, -17, -71, -75, -27, -56, -53, 65, 83};
        int[] test4 = {-32, -3, -70, 8, -40, -96, -18, -46, -21, -79};
        int[] test5 = {-50, 0, 64, 14, -56, -91, -65, -36, 51, -28};
        int[] test6 = {-58, -29, -35, -18, 43, -28, -76, 43, -13, 6};
        int[] test7 = {88, -17, -96, 43, 83, 99, 25, 90, -39, 86};

        angryProfessor(9, test);
        angryProfessor(8, test1);
        angryProfessor(7, test2);
        angryProfessor(2, test3);
        angryProfessor(10, test4);
        angryProfessor(9, test5);
        angryProfessor(6, test6);
        angryProfessor(1, test7);
    }

    static String angryProfessor(int k, int[] a) {
        int early = 0;
        for (int value : a) {
            if (value >= 0) early++;
        }
        return (early >= k) ? "NO" : "YES";
    }
}
