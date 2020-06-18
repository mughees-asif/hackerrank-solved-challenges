package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int nonZeroStones = scanner.nextInt();

            SortedSet<Integer> set = new TreeSet<>();
            int aDifference = scanner.nextInt();
            int bDifference = scanner.nextInt();

            for (int k = 0; k < nonZeroStones; k++) {
				int val = aDifference * (nonZeroStones - 1 - k) + bDifference * k;
				set.add(val);
			}
			for (Object it : set) {
				System.out.print(it + " ");
			}
            System.out.println();
        }
    }
}