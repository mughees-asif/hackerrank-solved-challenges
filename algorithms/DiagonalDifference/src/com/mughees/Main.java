package com.mughees;

public class Main {

    public static void main(String[] args) {

    }

    static int diagonalDifference(int[][] arr) {
        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int columns = arr[0].length;

        int i, j, k, l;
        i = 0; j = 0; k = 0;
        l = arr.length;

        while(i < rows && j < columns && k < rows && l >= 0) {
            left_to_right += arr[i][j];
            right_to_left += arr[k][l];
            i++; j++; k++;
            l--;
        }
        return Math.abs(left_to_right - right_to_left);
    }
}
