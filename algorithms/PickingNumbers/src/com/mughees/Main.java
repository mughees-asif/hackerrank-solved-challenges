package com.mughees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);
        System.out.println(pickingNumbers(list));
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[101];
        int count = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            freq[index] = freq[index] + 1;
        }
        for(int i = 1; i <= 100; i++) {
            count = Math.max(count, freq[i]+freq[i-1]);
        }
        return count;
    }
}
