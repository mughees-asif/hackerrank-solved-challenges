package com.mughees;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    static int camelcase(String s) {
        String[] split = s.split("[A-Z]");
        int result = 0;
        for(int i = 0; i < split.length; i++) {
            result = i;
        }
        return result + 1;
    }
}
