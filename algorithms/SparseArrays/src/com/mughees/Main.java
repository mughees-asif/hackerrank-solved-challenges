package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"})));
        System.out.println(Arrays.toString(matchingStrings(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"})));
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> map = new HashMap<>();
        int result[] = new int[queries.length];

        for (int i = 0; i < strings.length; i++) {
            String inputString = strings[i];
            if (map.containsKey(inputString)) {
                map.put(inputString, map.get(inputString) + 1);
            } else {
                map.put(inputString, 1);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            String queryString = queries[i];
            if (map.containsKey(queryString)) {
                result[i] = map.get(queryString);
            }
        }

        return result;
    }

//    public static void main(String[] args) { {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<String> name = new ArrayList<String>();
//        for (int i = 0; i < n; i++) {
//            name.add(sc.next());
//        }
//        int q = sc.nextInt();
//        for (int i = 0; i < q; i++) {
//            System.out.println(Collections.frequency(name, sc.next()));
//        }
//    }
}
