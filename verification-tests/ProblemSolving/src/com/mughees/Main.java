package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(arr.length);
        for (int value : arr) {
            list.add(value);
        }
        // System.out.println(longestSubarray(list));

        int[] arr2 = {295331535};
        List<Integer> list2 = new ArrayList<>(arr2.length);
        for (int i : arr2) {
            list.add(i);
        }
        // System.out.println(longestSubarray(list2));

        String[] string = {"Alpha", "Beta", "Zeta", "Beta", "Zeta", "Zeta",
                "Epsilon", "Beta", "Zeta", "Beta", "Zeta", "Beta", "Delta",
                "Zeta", "Beta", "Zeta", "Beta", "Zeta", "Beta", "Zeta", "Beta"};
        List<String> list3 = new ArrayList<>(arr2.length);
        list3.addAll(Arrays.asList(string));
        System.out.println(mostActive(list3));
    }

    // longest sub-array with k = 1
    public static int longestSubarray(List<Integer> arr) {
        if (arr.size() == 1) return 1;
        long maximum = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 1;
        while (i < arr.size() - 1) {
            set.add(arr.get(i));
            while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2) {
                if (!set.contains(arr.get(j))) {
                    if (set.size() == 2) {
                        break;
                    } else {
                        set.add(arr.get(j));
                    }
                }
                ++j;
            }
            maximum = Math.max(maximum, j - i);
            j = ++i + 1;
            set.clear();
        }
        return (int) maximum;
    }

    // active traders: return list with names of trades executed more than 5%
    public static List<String> mostActive(List<String> customers) {
        if (customers.size() == 1) return customers;
        double percentageOfTotalTraders;
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < customers.size(); i++) {
            double freqOfName = Collections.frequency(customers, customers.get(i));
            percentageOfTotalTraders = (freqOfName / customers.size()) * 100;
            if (percentageOfTotalTraders >= 5) {
                hashSet.add(customers.get(i));
            }
        }
        ArrayList<String> result = new ArrayList<>(hashSet);
        Collections.sort(result);
        return result;
    }
}
