package com.mughees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numOfToys = scanner.nextInt();
	    int moneyToSpend = scanner.nextInt();
	    int[] toyPrices = new int[numOfToys];
	    for(int i = 0; i < toyPrices.length; i++) {
	        toyPrices[i] = scanner.nextInt();
        }

	    int firstPointer = 0;
	    int secondPointer = 1;
	    int max = 0;
	    int sum = 0;

	    for(int i = 0; i < toyPrices.length; i++) {
	        sum += toyPrices[firstPointer] + toyPrices[secondPointer];
	        if(sum < moneyToSpend) {
	            secondPointer++;
	            max++;
            } else if (sum == moneyToSpend) {
                System.out.println(max);
            }
        }
    }
}
