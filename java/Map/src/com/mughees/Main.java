package com.mughees;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, query, phone;
        Map<String, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            name = in.nextLine();
            phone = in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            query = in.nextLine();
            if(map.containsKey(query)) {
                System.out.println(query+"="+map.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}