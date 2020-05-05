package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // test case
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> list = new LinkedList<Integer>();
        for (int value : arr) {
            list.add(value);
        }
        migratoryBirds(list);
    }

    public static int migratoryBirds(List<Integer> arr) {
        int[] typesOfBirds = new int[arr.size() + 1];
        int birdType = arr.size();
        for (Integer bird : arr) {
            typesOfBirds[bird]++;
            if (typesOfBirds[birdType] == typesOfBirds[bird] && birdType > bird || typesOfBirds[birdType] < typesOfBirds[bird]) {
                birdType = bird ;
            }
        }
        return birdType;
    }
}
