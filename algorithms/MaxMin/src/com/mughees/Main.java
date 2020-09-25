package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int target = scanner.nextInt();
        int[] numArr = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            numArr[i] = scanner.nextInt();
        }
        Arrays.sort(numArr);
//		System.out.println("Sorted Array = " + Arrays.toString(numArr));

//        int[] maxArr = new int[target];
//        System.arraycopy(numArr, maxArr.length - 1, maxArr, 0, target);

        int[] minArr = new int[target];
        System.arraycopy(numArr, 0, minArr, 0, target);

//        System.out.println("maxArr = " + Arrays.toString(maxArr));
//        System.out.println("minArr = " + Arrays.toString(minArr));

        int maxValue = getMax(minArr);
        int minValue = getMin(minArr);

        System.out.println(maxValue - minValue);
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
