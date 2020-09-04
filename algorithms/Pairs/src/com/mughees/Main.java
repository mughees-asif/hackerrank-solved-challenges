package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArr = scanner.nextInt();
        int targetValue = scanner.nextInt();
        int[] arr = new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = 0;

        while (right < sizeOfArr) {
            if (arr[right] - arr[left] == targetValue) {
                count++;
                left++;
                right++;
            } else if (arr[right] - arr[left] > targetValue) {
                left++;
            } else {
                right++;
            }
        }
        System.out.println(count);
    }
}
