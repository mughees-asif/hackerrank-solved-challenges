package com.mughees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"})));
        System.out.println(Arrays.toString(matchingStrings(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"})));
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        for (int i = 0; i < queries.length; i++) {
            for (String word : map.keySet()) {
                if (word.equals(queries[i])) {
                    result[i] = valueList.get(i);
                    break;
                }
            }
        }
        return result;
    }

    static int[] matchingStrings2(String[] strings, String[] queries) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> name = new ArrayList<String>();
        for (int i = 0; i < n; i++)
            name.add(sc.next());
        int q = sc.nextInt();
        for (int i = 0; i < q; i++)
            System.out.println(Collections.frequency(name, sc.next()));
    }
}
