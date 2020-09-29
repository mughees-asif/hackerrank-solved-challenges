package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int sizeOfArrays = scanner.nextInt();
        int targetToFind = scanner.nextInt();
        List<Integer> listA = new ArrayList<>(sizeOfArrays);
        List<Integer> listB = new ArrayList<>(sizeOfArrays);
        String result = "";

        for (int index = 0; index < testCases; index++) {

            for (int i = 0; i < sizeOfArrays; i++) {
                listA.add(scanner.nextInt());
            }

            for (int i = 0; i < sizeOfArrays; i++) {
                listB.add(scanner.nextInt());
            }

            Collections.sort(listA);
            Collections.reverse(listB);

            for (int i = 0; i < sizeOfArrays; i++) {
                if (listA.get(i) + listB.get(i) != targetToFind) {
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
