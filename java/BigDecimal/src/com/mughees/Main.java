package com.mughees;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            BigDecimal max = new BigDecimal(s[i]);
            int index = i;
            for (int j = i + 1; j < n; j++) {
                BigDecimal current = new BigDecimal(s[j]);
                if (current.compareTo(max) == 1) {
                    max = current;
                    index = j;
                }
            }
            String temp = s[i];
            s[i] = s[index];
            s[index] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}