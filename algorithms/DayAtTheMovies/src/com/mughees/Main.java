package com.mughees;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(beautifulDays(23, 20, 6));
    }

    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        for(int start = i; start <= j; start++) {
            if(Math.abs(start - Integer.parseInt(new StringBuilder().append(start).reverse().toString())) % k == 0)
                beautifulDays++;
        }
        return beautifulDays;
    }
}
