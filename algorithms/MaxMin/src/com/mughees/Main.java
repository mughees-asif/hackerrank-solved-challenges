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

        int minUnfairness = numArr[target - 1] - numArr[0];
        for (int i = 0; i < numArr.length - target + 1; i++) {
            if ((numArr[i + target - 1] - numArr[i]) < minUnfairness)
                minUnfairness = numArr[i + target - 1] - numArr[i];
        }
		System.out.println(minUnfairness);
    }
}
