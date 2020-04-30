package com.mughees;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test case
        List<Integer> sample = Arrays.asList(4);
	    birthday(sample, 4 ,1);
    }

    private static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        int sum;
        for(int i = 0; i < s.size() - (m + 1); i++) {
             sum = s.get(i);
             int j = i + 1;
             while (j < (i + m)) {
                 sum += s.get(j++);
            }
             if(sum == d) {
                 counter++;
             }
        }
        System.out.println(counter);
        return counter;
    }
}
