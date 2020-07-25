package com.mughees;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
    }

    static String isValid(String s) {
        // First, we're going to walk over the characters and count how many
        // times each character occurs
        Map<Character, Long> charOccurs = s.chars()
                .mapToObj(t -> (char) t)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        // Then we're going to map each amount of characters found to its count,
        // e.g. in the string "aabbcc" each character occurs twice → [2, 2, 2].
        // That will yield a map: [2=3]
        Map<Long, Long> counts = charOccurs.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        switch (counts.size()) {
            // If all characters occur an equal number of times, then the map
            // contains just a single entry.
            case 1:
                return "YES";

            // If there are two different amounts, then the difference between
            // those two must be 1. Also, one of the numbers must occur exactly
            // once.
            case 2:
                Iterator<Long> it = counts.keySet().iterator();
                boolean diff = Math.abs(it.next() - it.next()) == 1;
                if (diff && (counts.values().stream()
                        .anyMatch(i -> i == 1))) {
                    return "YES";
                } else {
                    return "NO";
                }

                // If the map's size is 3 or more, there are different amounts of
                // characters.
            default:
                return "NO";
        }
    }
}
