package com.mughees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static int getTotalX (List<Integer> a, List<Integer> b) {
        int a_i = a.get(0);
        for(int i = 0; i < a.size(); i++) {
            a_i = lcm(a_i, a.get(i));
        }
        int b_i  = b.get(0);
        for(int i = 0; i < b.size(); i++) {
            b_i = gcd(b_i, b.get(i));
        }

        List<Integer> newList = new ArrayList<>();
        int temp = a_i;
        while(temp <= b_i) {
            newList.add(temp);
            temp += a_i;
        }
        int counter = 0;
        for (int i : newList) {
            boolean multiple = true;
            for (int j : b) {
                if (j % i != 0) {
                    multiple = false;
                    break;
                }
            }
            if(multiple) {
                counter++;
            }
        }
        return counter;
    }

    // greatest common denominator
    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, (x % y));
    }

    // lowest common denominator [Euclidean algorithm]
    private static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
}
