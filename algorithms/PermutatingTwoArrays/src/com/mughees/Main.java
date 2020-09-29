package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int sizeOfArrays = scanner.nextInt();
        int targetToFind = scanner.nextInt();
        List<Integer> arrayA = new ArrayList<>(sizeOfArrays);
        List<Integer> arrayB = new ArrayList<>(sizeOfArrays);

        for (int index = 0; index < testCases; index++) {
            for (int i = 0; i < sizeOfArrays; i++) {
                arrayA.add(scanner.nextInt());
            }
//        System.out.println(arrayA);
            for (int i = 0; i < sizeOfArrays; i++) {
                arrayB.add(scanner.nextInt());
            }
//        System.out.println(arrayB);

            Collections.sort(arrayA);
            Collections.reverse(arrayB);

            String result = "";

            for (int i = 0; i < sizeOfArrays; i++) {
                if (arrayA.get(i) + arrayB.get(i) != targetToFind) {
                    result = "NO";
                    break;
                } else {
                    result = "YES";
                }
            }
            System.out.println(result);
        }
    }
}
