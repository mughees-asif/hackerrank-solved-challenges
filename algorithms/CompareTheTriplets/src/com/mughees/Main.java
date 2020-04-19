package com.mughees;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int A = 0, B = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)){
                A++;
            } else if (a.get(i) < b.get(i)) {
                B++;
            }
        }
        return Arrays.asList(A, B);
    }
}
