package com.mughees;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
        System.out.println(camelCase("saveChangesInTheEditor"));
    }

    // Java 8
    static int camelcase(String s) {
        String[] split = s.split("[A-Z]");
        int result = 0;
        for(int i = 0; i < split.length; i++) {
            result = i;
        }
        return result + 1;
    }

    // Java 11
    static int camelCase(String s) {
        String[] split = s.split("[A-Z]");
        return Array.getLength(split);
    }
}
