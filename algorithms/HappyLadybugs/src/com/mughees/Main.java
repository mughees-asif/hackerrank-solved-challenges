package com.mughees;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();

        tests:
        for (int a0 = 0; a0 < Q; a0++) {
            int n = in.nextInt();
            String b = in.next();

            /*
            Program logic flow:
            --------------------
            find frequencies of all letters

            if all frequencies are >= 2 and a _ is present
                YES

            else if they are >= 2 and no _ is present
                if it is already ordered
                    YES
                else
                    NO

            else
                NO
            --------------------
             */

            HashMap<Character, Integer> colorFreq = new HashMap<>();
            for (int i = 0; i < b.length(); i++) {
                Character letter = b.charAt(i);
                if (colorFreq.containsKey(letter)) {
                    colorFreq.put(letter, colorFreq.get(letter) + 1);
                } else {
                    colorFreq.put(letter, 1);
                }
            }

            for (Map.Entry<Character, Integer> frequency : colorFreq.entrySet()) {
                if (frequency.getValue() < 2 && !frequency.getKey().equals('_')) {
                    System.out.println("NO");
                    continue tests;
                }
            }

            if (!colorFreq.containsKey('_')) {
                int count = 0;
                char last = b.charAt(0);
                for (int i = 0; i < b.length(); i++) {
                    char curr = b.charAt(i);

                    if (curr == last) {
                        count++;
                    } else {
                        if (count < 2) {
                            System.out.println("NO");
                            continue tests;
                        } else {
                            count = 1;
                        }
                    }
                    last = curr;
                }
                System.out.println("YES");
            } else {
                System.out.println("YES");
            }
        }
    }
}
