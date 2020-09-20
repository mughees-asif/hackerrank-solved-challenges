package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEmptyJars = scanner.nextInt();
        int operations = scanner.nextInt();
        int[] candyArray = new int[numOfEmptyJars];

        for (int i = 0; i < operations; i++) {
            int firstInput = scanner.nextInt();
            int secondInput = scanner.nextInt();
            int numOfCandiesAdded = scanner.nextInt();

            for (int j = firstInput - 1; j < secondInput; j++) {
                candyArray[j] += numOfCandiesAdded;
            }
        }
		double totalJars = candyArray.length;
		double sum = 0;
		for (double value : candyArray) {
			sum += value;
		}
		System.out.println(Math.floor(sum / totalJars));
    }
}
