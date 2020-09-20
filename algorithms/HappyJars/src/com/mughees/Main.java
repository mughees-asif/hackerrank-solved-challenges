package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numOfEmptyJars = scanner.nextInt();
	    int operations = scanner.nextInt();
	    int[] candyArray = new int[numOfEmptyJars];

	    for(int i = 0; i < operations; i++) {
	        int firstInput = scanner.nextInt();
	        int secondInput = scanner.nextInt();
	        int numOfCandiesAdded = scanner.nextInt();

	        for(int j = firstInput; j < secondInput; j++) {
				candyArray[j - 1] += numOfCandiesAdded;


			}
        }
		System.out.println(Arrays.toString(candyArray));
    }

//	static int solve(int n, int[][] operations) {
//		int average = 0;
//		for(int wholeArrayIndex = 0; wholeArrayIndex < )
//
//
//	}


}
