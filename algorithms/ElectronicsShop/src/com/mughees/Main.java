package com.mughees;

public class Main {

    public static void main(String[] args) {
	    int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        System.out.println(getMoneySpent(keyboards, drives, 10));
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int i, j, sum, max = 0;
        for(i = 0; i < keyboards.length; i++) {
            for(j = 0; j < drives.length; j++) {
                sum = keyboards[i] + drives[j];
                if(sum >= max && sum <= b)      max = sum;
            }
        }
        if (max == 0)       return -1;
        else                return max;
    }
}