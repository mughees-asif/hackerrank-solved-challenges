package com.mughees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numOfElements = scanner.nextInt();
	    int target = scanner.nextInt();
	    int[] numArr = new int[numOfElements];
	    for(int i = 0; i < numOfElements; i++) {
	        numArr[i] = scanner.nextInt();
        }
        Arrays.sort(numArr);

	    int[] maxArr = new int[target];
		System.arraycopy(numArr, 0,maxArr, 0, maxArr.length - target);
		int[] minArr = new int[target];

		System.arraycopy(numArr, 0,minArr, 0, target);

		System.out.println("maxArr" + Arrays.toString(maxArr));
		System.out.println("minArr" + Arrays.toString(minArr));
    }
}
