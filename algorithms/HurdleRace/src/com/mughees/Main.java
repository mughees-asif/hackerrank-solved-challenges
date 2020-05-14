package com.mughees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] test = {2,5,4,5,2};
        System.out.println(hurdleRace(test, 7));
    }

    public static int hurdleRace(int[] height, int k) {
        Arrays.sort(height);
        int minDose = height[height.length - 1] - k;
        return Math.max(minDose, 0);
    }
}
